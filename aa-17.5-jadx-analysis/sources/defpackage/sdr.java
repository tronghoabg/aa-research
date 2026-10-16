package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class sdr extends sei {
    private ViewGroup c;
    private final HashMap d = new HashMap();
    public boolean a = false;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final void a() {
        for (Map.Entry entry : ((seb) b().l).z().a.entrySet()) {
            xbz xbzVar = (xbz) this.d.get(entry.getKey());
            if (xbzVar != null) {
                ser serVar = (ser) entry.getValue();
                if (serVar.a == 4) {
                    ProgressBar progressBar = xbzVar.c;
                    progressBar.setVisibility(0);
                    progressBar.setProgress((int) (serVar.b * 100.0f));
                } else {
                    xbzVar.c.setVisibility(8);
                }
                TextView textView = xbzVar.e;
                int i = serVar.a;
                textView.setText(i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : R.string.car_frx_app_status_in_progress : R.string.car_frx_app_status_missing : R.string.car_frx_app_status_update : R.string.car_frx_app_status_ready);
                if (serVar.a == 1) {
                    ImageView imageView = xbzVar.b;
                    imageView.setImageAlpha(255);
                    xbzVar.d.setVisibility(4);
                    if (xbzVar.f) {
                        try {
                            imageView.setImageDrawable(xbzVar.g.getContext().getPackageManager().getApplicationIcon(xbzVar.a));
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                } else {
                    xbzVar.b.setImageAlpha(100);
                    if (((sdr) xbzVar.g).a) {
                        ImageView imageView2 = xbzVar.d;
                        imageView2.setVisibility(0);
                        imageView2.setImageAlpha(127);
                        imageView2.setImageResource(R.drawable.ic_file_download);
                    } else {
                        xbzVar.d.setVisibility(4);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc bcVar = (bc) getContext();
        View viewInflate = layoutInflater.inflate(R.layout.car_frx_installing_apps_progress, viewGroup, false);
        qrv.s(layoutInflater, (ViewGroup) viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.body);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.new_title);
        textView2.setVisibility(0);
        viewInflate.findViewById(R.id.title).setVisibility(8);
        textView2.setText(bcVar.getString(R.string.car_setup_download_apps_title));
        textView.setText(bcVar.getString(R.string.car_setup_download_apps_message));
        Button button = (Button) viewInflate.findViewById(R.id.left_button);
        button.setVisibility(0);
        button.setText(getString(R.string.common_exit));
        button.setOnClickListener(new sdo((Fragment) this, 3));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getBoolean("installation_allowed", false);
        }
        this.c = (ViewGroup) viewInflate.findViewById(R.id.apps_list);
        erb erbVarZ = ((seb) b().l).z();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : erbVarZ.a.entrySet()) {
            String str = (String) entry.getKey();
            ser serVar = (ser) entry.getValue();
            xby xbyVarC = sev.c(str);
            if (xbyVarC == null) {
                xbyVarC = new xby(Alert.DURATION_SHOW_INDEFINITELY, str, 0, 0, serVar.c, null);
            }
            View viewInflate2 = layoutInflater.inflate(R.layout.car_frx_app_item, this.c, false);
            this.d.put(xbyVarC.b, new xbz(this, xbyVarC, (ViewGroup) viewInflate2));
            arrayList.add(new dzi(Integer.valueOf(xbyVarC.a), viewInflate2));
        }
        Collections.sort(arrayList, new civ(10));
        int size = arrayList.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            View view = (View) ((dzi) arrayList.get(i)).b;
            if (!z) {
                view.setPadding(0, getResources().getDimensionPixelSize(R.dimen.car_frx_app_item_spacer), 0, 0);
            }
            this.c.addView(view);
            i++;
            z = false;
        }
        a();
        if (!this.a) {
            Button button2 = (Button) viewInflate.findViewById(R.id.right_button);
            button2.setText(R.string.common_download);
            button2.setOnClickListener(new sdo((Fragment) this, 4));
            button2.setVisibility(0);
        }
        return viewInflate;
    }
}
