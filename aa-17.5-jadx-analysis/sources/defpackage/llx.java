package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final /* synthetic */ class llx implements ten {
    private final /* synthetic */ int a;

    public /* synthetic */ llx(int i) {
        this.a = i;
    }

    @Override // defpackage.ten
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return new lmd((MediaMetadataCompat) obj);
            case 1:
                return new AaPlaybackState((PlaybackStateCompat) obj);
            case 2:
                return new llu((dn) obj);
            case 3:
                return new lmd((MediaMetadataCompat) obj);
            case 4:
                return new llu((dn) obj);
            case 5:
                return new AaPlaybackState((PlaybackStateCompat) obj);
            case 6:
                return ((ljx) obj).a;
            case 7:
                yph yphVar = lmu.a;
                return ((lol) obj).d();
            case 8:
                return Integer.valueOf(((llu) obj).x());
            case 9:
                return ljt.a((lmd) obj);
            case 10:
                return ljt.b((lmd) obj);
            case 11:
                return ljt.a((lmd) obj);
            case 12:
                return ljt.b((lmd) obj);
            case 13:
                return ljt.b((lmd) obj);
            case 14:
                return ljt.a((lmd) obj);
            case 15:
                return Integer.valueOf(((AaPlaybackState) obj).Q());
            case 16:
                return ((lmd) obj).h();
            case 17:
                return ((lmc) obj).S();
            case 18:
                return ((lmc) obj).R();
            case 19:
                return ((lmc) obj).Q();
            default:
                return ljt.a((lmd) obj);
        }
    }
}
