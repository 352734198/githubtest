package fullscence.heqian.com.fullscencecamera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView[] imageViews = new ImageView[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //取消状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



        imageViews[0] = (ImageView) findViewById(R.id.image_record);
        imageViews[1] = (ImageView) findViewById(R.id.image_full_adjust);
        imageViews[2] = (ImageView) findViewById(R.id.image_scence_adjust);
        imageViews[3] = (ImageView) findViewById(R.id.image_system_set);
        imageViews[4] = (ImageView) findViewById(R.id.image_back);

        for(ImageView imageView :imageViews){
            imageView.setOnClickListener(this);
        }
       //setClickeView(0);

    }

    @Override
    public void onClick(View view) {

        if(view == imageViews[0]){
            setClickeView(0);
        }else if(view == imageViews[1]){
            setClickeView(1);
        }else if(view == imageViews[2]){
            setClickeView(2);
        }else if(view == imageViews[3]){
            setClickeView(3);
        }else if(view == imageViews[4]){
            setClickeView(4);
        }
    }

    private void setClickeView(int position){

        for(int i=0; i< imageViews.length; i++){

            if(i == position){
                imageViews[i].setActivated(true);
            }else{
                imageViews[i].setActivated(false);
            }

        }
    }


}
