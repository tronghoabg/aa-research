package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xca extends sei {
    private static final xby[] c = {new xby(1, RemoteApiConstants.NOW_PACKAGE, R.string.frx_app_google_app, 2131231093, null), new xby(0, "com.google.android.projection.gearhead", R.string.app_name, 2131231091, null), new xby(2, "com.google.android.apps.maps", R.string.frx_app_google_maps, 2131231092, null), new xby(3, "com.google.android.tts", R.string.frx_app_tts, 2131231100, null), new xby(2, "com.locnall.KimGiSa", R.string.frx_app_kakaomap, R.drawable.car_app_kakaomap, null), new xby(2, "com.waze", R.string.frx_app_waze, R.drawable.car_app_waze, null)};
    private static final xby[] d = {new xby(0, "com.google.android.projection.gearhead", R.string.app_name, 2131231091, null), new xby(3, "com.google.android.tts", R.string.frx_app_tts, 2131231100, null)};
    private ViewGroup e;
    private final HashMap f = new HashMap();
    public boolean a = false;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final void a() {
        int i;
        for (Map.Entry entry : ((xcj) b().l).z().a.entrySet()) {
            xbz xbzVar = (xbz) this.f.get(entry.getKey());
            if (xbzVar != null) {
                lfj lfjVar = (lfj) entry.getValue();
                if (lfjVar.a == 4) {
                    ProgressBar progressBar = xbzVar.c;
                    progressBar.setVisibility(0);
                    progressBar.setProgress((int) (lfjVar.b * 100.0f));
                } else {
                    xbzVar.c.setVisibility(8);
                }
                TextView textView = xbzVar.e;
                int i2 = lfjVar.a;
                if (i2 == 1) {
                    i = R.string.frx_app_status_ready;
                } else if (i2 == 2) {
                    i = R.string.frx_app_status_update;
                } else if (i2 == 3) {
                    i = R.string.frx_app_status_missing;
                } else {
                    if (i2 != 4) {
                        throw new AssertionError(a.bp(i2, "Unrecognized app state: "));
                    }
                    i = R.string.frx_app_status_in_progress;
                }
                textView.setText(i);
                if (lfjVar.a == 1) {
                    ImageView imageView = xbzVar.b;
                    imageView.setImageAlpha(255);
                    xbzVar.d.setVisibility(4);
                    if (xbzVar.f) {
                        try {
                            imageView.setImageDrawable(xbzVar.g.getActivity().getPackageManager().getApplicationIcon(xbzVar.a));
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                } else {
                    xbzVar.b.setImageAlpha(100);
                    if (((xca) xbzVar.g).a) {
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

    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        xby xbyVar;
        View viewInflate = layoutInflater.inflate(R.layout.car_frx_installing_apps_progress, viewGroup, false);
        roc.bq(layoutInflater, (ViewGroup) viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        textView.setText(R.string.frx_download_apps_title);
        textView2.setText(R.string.frx_download_apps_body);
        Button button = (Button) viewInflate.findViewById(R.id.left_button);
        button.setVisibility(0);
        button.setText(R.string.frx_exit);
        button.setOnClickListener(new xao(this, 13));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getBoolean("installation_allowed", false);
        }
        this.e = (ViewGroup) viewInflate.findViewById(R.id.apps_list);
        lds ldsVarZ = ((xcj) b().l).z();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ldsVarZ.a.entrySet()) {
            String str = (String) entry.getKey();
            lfj lfjVar = (lfj) entry.getValue();
            xby xbyVar2 = null;
            if (acxa.U()) {
                xby[] xbyVarArr = d;
                int length = xbyVarArr.length;
                for (int i = 0; i < 2; i++) {
                    xbyVar = xbyVarArr[i];
                    if (xbyVar.b.equals(str)) {
                        xbyVar2 = xbyVar;
                        break;
                    }
                }
            } else {
                xby[] xbyVarArr2 = c;
                int length2 = xbyVarArr2.length;
                for (int i2 = 0; i2 < 6; i2++) {
                    xbyVar = xbyVarArr2[i2];
                    if (xbyVar.b.equals(str)) {
                        xbyVar2 = xbyVar;
                        break;
                    }
                }
            }
            if (xbyVar2 == null) {
                xbyVar2 = new xby(Alert.DURATION_SHOW_INDEFINITELY, str, 0, 0, (String) lfjVar.c);
            }
            View viewInflate2 = layoutInflater.inflate(R.layout.car_frx_app_item, this.e, false);
            this.f.put(xbyVar2.b, new xbz(this, xbyVar2, (ViewGroup) viewInflate2));
            arrayList.add(new dzi(xbyVar2, viewInflate2));
        }
        Collections.sort(arrayList, new civ(19));
        int size = arrayList.size();
        boolean z = true;
        int i3 = 0;
        while (i3 < size) {
            View view = (View) ((dzi) arrayList.get(i3)).b;
            if (!z) {
                view.setPadding(0, getResources().getDimensionPixelSize(R.dimen.car_frx_app_item_spacer), 0, 0);
            }
            this.e.addView(view);
            i3++;
            z = false;
        }
        a();
        if (!this.a) {
            Button button2 = (Button) viewInflate.findViewById(R.id.right_button);
            button2.setText(R.string.frx_download_apps_accept);
            button2.setOnClickListener(new xao(this, 14));
            button2.setVisibility(0);
        }
        return viewInflate;
    }
}
