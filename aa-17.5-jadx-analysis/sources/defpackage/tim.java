package defpackage;

import androidx.car.app.model.CarText;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class tim implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tim(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws IOException {
        switch (this.b) {
            case 0:
                return new tin((CarText) this.a);
            case 1:
                return new ParcelableSnapshotMutableState(((qz) this.a).a().getResources().getConfiguration(), bxp.c);
            case 2:
                return new tji(this.a);
            case 3:
                return Boolean.valueOf(((tla) this.a).c.isCurrentThread());
            case 4:
                return Boolean.valueOf(((tla) this.a).c.isCurrentThread());
            case 5:
                return Boolean.valueOf(((tla) this.a).c.isCurrentThread());
            case 6:
                return Boolean.valueOf(affa.f(Thread.currentThread(), ((tle) this.a).c));
            case 7:
                return afez.d((Object[]) this.a);
            case 8:
                return this.a.iterator();
            case 9:
                return affc.javaContainingDeclaration_delegate$lambda$0((affc) this.a);
            case 10:
                return this.a;
            case 11:
                return ajhu.b(this.a);
            case 12:
                return this.a;
            default:
                ((ajlc) this.a).g(false, 2, 0);
                return afak.a;
        }
    }
}
