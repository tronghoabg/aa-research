package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class mlt extends Fragment {
    public ImageView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public LinearProgressIndicator e;
    public Button f;
    public Button g;

    public mlt() {
        super(R.layout.material3_main_fragment_layout);
    }

    protected abstract void a();

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.a = (ImageView) view.findViewById(R.id.status_icon);
        this.b = (TextView) view.findViewById(R.id.title);
        this.d = (ImageView) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.message);
        this.c = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.e = (LinearProgressIndicator) view.findViewById(R.id.progress_indicator);
        Button button = (Button) view.findViewById(R.id.secondary_action_button);
        this.g = button;
        button.setOnClickListener(new mli(this, 3));
        Button button2 = (Button) view.findViewById(R.id.main_action_button);
        this.f = button2;
        button2.setVisibility(4);
        a();
    }
}
