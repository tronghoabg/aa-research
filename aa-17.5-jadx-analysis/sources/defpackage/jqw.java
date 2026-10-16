package defpackage;

import com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider;
import com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final /* synthetic */ class jqw implements tgr {
    private final /* synthetic */ int a;

    public /* synthetic */ jqw(int i) {
        this.a = i;
    }

    @Override // defpackage.tgr
    public final Object a() {
        switch (this.a) {
            case 0:
                return new jre();
            case 1:
                return new jqt(mki.a.c);
            case 2:
                return new juv();
            case 3:
                return new jxg();
            case 4:
                return new jxv();
            case 5:
                return new jzc();
            case 6:
                return new jzd();
            case 7:
                return new ket();
            case 8:
                return new kex(Executors.newSingleThreadScheduledExecutor(), new jty());
            case 9:
                return new kgt();
            case 10:
                return new kma();
            case 11:
                return new kqd(new ogz(mki.a.c), (kpy) mki.a.i(kpy.class));
            case 12:
                return new kwd();
            case 13:
                return GhMicrophoneContentProvider.b;
            case 14:
                return new kya(mki.a.c);
            case 15:
                return new kzd();
            case 16:
                return new kzi();
            case 17:
                return new kzj();
            case 18:
                return new kzn();
            case 19:
                return new FirstDriveNotificationManager();
            default:
                return new lix();
        }
    }
}
