package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import com.google.android.projection.gearhead.R;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class wyr extends Activity {
    protected abstract Collection a();

    public abstract void b();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        for (wyq wyqVar : a()) {
            if (!wyqVar.d()) {
                yflVar.i(wyqVar);
            }
        }
        yfq yfqVarG = yflVar.g();
        if (yfqVarG.isEmpty()) {
            finish();
            return;
        }
        setContentView(R.layout.activity_request_permissions);
        Button button = (Button) findViewById(R.id.left_button);
        Button button2 = (Button) findViewById(R.id.right_button);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.permissions_list);
        button.setVisibility(0);
        button.setText(R.string.frx_exit);
        button.setOnClickListener(new wwt(this, 3, null));
        button2.setVisibility(0);
        button2.setText(R.string.frx_continue);
        button2.setOnClickListener(new wwt(this, 4, null));
        recyclerView.ab(new LinearLayoutManager(1));
        recyclerView.Z(new wyp(this, yfqVarG));
    }
}
