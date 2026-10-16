package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes.dex */
public final class wze extends lt {
    public final Context a;
    public List e;
    public boolean f;

    public wze(Context context) {
        this.a = context;
    }

    private final int b() {
        return (this.f ? 1 : 0) + 1;
    }

    @Override // defpackage.lt
    public final int a() {
        return this.e.size() + b();
    }

    @Override // defpackage.lt
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            if (this.f) {
                return 1;
            }
            i = 1;
        }
        return ((wyx) ((wyw) this.e.get(i - b())).d).g;
    }

    @Override // defpackage.lt
    public final /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new wzd(this, LayoutInflater.from(this.a).inflate(R.layout.parallax_header, viewGroup, false));
        }
        if (i == 1) {
            return new mo(LayoutInflater.from(this.a).inflate(R.layout.connect_banner, viewGroup, false));
        }
        if (i == 2) {
            return new wza(LayoutInflater.from(this.a).inflate(R.layout.companion_app_card_normal, viewGroup, false));
        }
        if (i == 3) {
            return new wyz(LayoutInflater.from(this.a).inflate(R.layout.companion_app_card_icon, viewGroup, false));
        }
        if (i == 4) {
            return new wyy(LayoutInflater.from(this.a).inflate(R.layout.companion_app_card_background, viewGroup, false));
        }
        if (i != 6) {
            return null;
        }
        return new wzb(LayoutInflater.from(this.a).inflate(R.layout.companion_app_card_two_actions, viewGroup, false));
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        int iD = d(i);
        if (iD == 0 || iD == 1) {
            return;
        }
        moVar.D((wyw) this.e.get(i - b()));
    }
}
