package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class lka implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ lka(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String strI;
        switch (this.a) {
            case 0:
                String str = (String) lkb.a.get((Long) obj);
                str.getClass();
                return str;
            case 1:
                Map map = lkb.a;
                return (CharSequence) new ntn(((AaPlaybackState.AaCustomAction) obj).P()).i("null");
            case 2:
                return new llu((MediaBrowserCompat.MediaItem) obj);
            case 3:
                return new llu((MediaBrowserCompat.MediaItem) obj);
            case 4:
                return new llu((MediaSessionCompat.QueueItem) obj);
            case 5:
                return new llu((MediaSessionCompat.QueueItem) obj);
            case 6:
                return new AaPlaybackState.AaCustomAction((PlaybackStateCompat.CustomAction) obj);
            case 7:
                return ((mqc) obj).a();
            case 8:
                int i = lno.a;
                return (String) new ntn(((lmb) obj).R()).i("null");
            case 9:
                llu lluVar = (llu) obj;
                yph yphVar = lod.a;
                lmc lmcVar = new lmc(((MediaSessionCompat.QueueItem) lluVar.b).a);
                Bundle bundle = new Bundle();
                bundle.putAll(lmcVar.n());
                bundle.putLong("QUEUE_ID", lluVar.J());
                if (TextUtils.isEmpty(lmcVar.i())) {
                    strI = "QUEUE_ITEM_" + lluVar.J();
                } else {
                    strI = lmcVar.i();
                }
                llu lluVar2 = new llu((short[]) null);
                lluVar2.G(strI);
                lluVar2.I(lmcVar.S());
                lluVar2.H(lmcVar.R());
                lluVar2.C(lmcVar.Q());
                lluVar2.E(lmcVar.O());
                lluVar2.F(lmcVar.P());
                lluVar2.D(bundle);
                return new llu(lluVar2.B(), 2);
            case 10:
                return ((mqc) obj).a();
            case 11:
                return lpq.a((lmb) obj);
            case 12:
                return new lps((orz) obj);
            case 13:
                return ((mqc) obj).a();
            case 14:
                yph yphVar2 = lqz.a;
                return ((ComponentName) obj).flattenToString();
            case 15:
                yph yphVar3 = lsc.a;
                return new eqm(null);
            case 16:
                yph yphVar4 = lsc.a;
                return new eqm(null);
            case 17:
                yph yphVar5 = lsc.a;
                return new eqm(null);
            case 18:
                return ((ComponentName) obj).getPackageName();
            case 19:
                ComponentName componentName = (ComponentName) obj;
                int i2 = lup.d;
                return new mqc(componentName, mcd.A().r(mki.a.c, componentName.getPackageName()) ? mpz.c : mpz.a);
            default:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                int i3 = lur.b;
                return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
