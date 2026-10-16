package t0;

import android.os.SystemClock;
import android.view.MotionEvent;
import ef.C2515C;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import u0.C4185l0;
import u0.C4188n;
import u0.C4195s;
import u1.C4209G;

/* renamed from: t0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4068p extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f45484i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f45485j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4068p(Object obj, int i5) {
        super(0);
        this.f45484i = i5;
        this.f45485j = obj;
    }

    @Override // tf.a
    public final Object invoke() {
        int actionMasked;
        switch (this.f45484i) {
            case 0:
                t tVar = (t) this.f45485j;
                tVar.f45531v = 0;
                P.d dVarL = tVar.l();
                int i5 = dVarL.f8972c;
                if (i5 > 0) {
                    Object[] objArr = dVarL.f8970a;
                    int i10 = 0;
                    do {
                        t tVar2 = (t) objArr[i10];
                        tVar2.f45530u = tVar2.f45529t;
                        tVar2.f45529t = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        tVar2.f45527r.getClass();
                        if (tVar2.f45508O == 2) {
                            tVar2.f45508O = 3;
                        }
                        i10++;
                    } while (i10 < i5);
                }
                tVar.f45533x.I().c();
                P.d dVarL2 = tVar.l();
                int i11 = dVarL2.f8972c;
                if (i11 > 0) {
                    Object[] objArr2 = dVarL2.f8970a;
                    int i12 = 0;
                    do {
                        t tVar3 = (t) objArr2[i12];
                        if (tVar3.f45530u != tVar3.f45529t) {
                            tVar.x();
                            tVar.o();
                            if (tVar3.f45529t == Integer.MAX_VALUE) {
                                tVar3.u();
                            }
                        }
                        u uVar = tVar3.f45527r;
                        uVar.getClass();
                        uVar.f45538c = false;
                        i12++;
                    } while (i12 < i11);
                }
                return C2515C.f34653a;
            case 1:
                y yVar = ((y) this.f45485j).f45562f;
                if (yVar != null) {
                    yVar.R();
                }
                return C2515C.f34653a;
            case 2:
                ((tf.l) this.f45485j).invoke(y.f45558w);
                return C2515C.f34653a;
            case 3:
                C4037B c4037b = (C4037B) this.f45485j;
                c4037b.f45421b.o(c4037b);
                return C2515C.f34653a;
            case 4:
                C4188n c4188n = (C4188n) this.f45485j;
                MotionEvent motionEvent = c4188n.f46293e0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c4188n.f46295f0 = SystemClock.uptimeMillis();
                    c4188n.post(c4188n.f46301i0);
                }
                return C2515C.f34653a;
            case 5:
                ((C4185l0) this.f45485j).getClass();
                return C2515C.f34653a;
            case 6:
                File file = (File) ((C4209G) this.f45485j).f46444a.invoke();
                String it = file.getAbsolutePath();
                synchronized (C4209G.k) {
                    LinkedHashSet linkedHashSet = C4209G.f46443j;
                    if (linkedHashSet.contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    AbstractC3340k.d(it, "it");
                    linkedHashSet.add(it);
                }
                return file;
            default:
                File file2 = (File) ((A0.e) this.f45485j).invoke();
                String name = file2.getName();
                AbstractC3340k.d(name, "getName(...)");
                if (Bf.k.N0('.', name, "").equals("preferences_pb")) {
                    return file2;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4068p(C4185l0 c4185l0, C4195s c4195s) {
        super(0);
        this.f45484i = 5;
        this.f45485j = c4185l0;
    }
}
