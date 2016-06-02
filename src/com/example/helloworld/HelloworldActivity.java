package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class HelloworldActivity extends ActionBarActivity {
	 EditText et1;
    @Override
   
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);
    //1.获取号码
    Button bt=(Button)findViewById(R.id.button1);   //设置按钮监听器
    et1=(EditText)findViewById(R.id.editText1);
    bt.setOnClickListener(new OnClickListener()
    {
    	
    	public void onClick(View arg0) {
    		// TODO Auto-generated method stub
    		String num=et1.getText().toString();
    		Intent a=new Intent();
    		a.setAction(Intent.ACTION_DIAL);
    	    a.setData(Uri.parse("tel://"+num));
    	    startActivity(a);
    }	
    });
    }
/*private class MyListener implements OnClickListener   //实现接口
{

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String num=et1.getText().toString();
		Intent a=new Intent();
		a.setAction(Intent.ACTION_DIAL);
	    a.setData(Uri.parse("tel://"+num));
	    startActivity(a);
}
}*/
    
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.helloworld, menu);
        return true;
    }

   
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
