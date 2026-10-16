package J9;

import Va.M6;
import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Iterator;
import z9.C4634b;
import z9.C4635c;
import z9.EnumC4651t;

/* renamed from: J9.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0655n implements Le.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0656o f5960b;

    public /* synthetic */ C0655n(C0656o c0656o, int i5) {
        this.f5959a = i5;
        this.f5960b = c0656o;
    }

    @Override // Le.a
    public final void run() {
        boolean zB;
        switch (this.f5959a) {
            case 0:
                C0656o c0656o = this.f5960b;
                final G g9 = (G) c0656o.f5967g;
                g9.getClass();
                final N9.h hVar = (N9.h) c0656o.f5969i;
                if (!hVar.f8623b.f3290b) {
                    final int i5 = 0;
                    ((P9.c) g9.f5879c).d().addOnSuccessListener(g9.f5883g, new OnSuccessListener() { // from class: J9.E
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            String str = (String) obj;
                            switch (i5) {
                                case 0:
                                    EnumC4651t enumC4651t = EnumC4651t.IMPRESSION_EVENT_TYPE;
                                    N9.h hVar2 = hVar;
                                    G g10 = g9;
                                    C4634b c4634bA = g10.a(hVar2, str);
                                    c4634bA.e(enumC4651t);
                                    g10.f5877a.b(((C4635c) c4634bA.build()).toByteArray());
                                    break;
                                default:
                                    EnumC4651t enumC4651t2 = EnumC4651t.CLICK_EVENT_TYPE;
                                    N9.h hVar3 = hVar;
                                    G g11 = g9;
                                    C4634b c4634bA2 = g11.a(hVar3, str);
                                    c4634bA2.e(enumC4651t2);
                                    g11.f5877a.b(((C4635c) c4634bA2.build()).toByteArray());
                                    break;
                            }
                        }
                    });
                    int i10 = F.f5874a[hVar.f8622a.ordinal()];
                    boolean z2 = false;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            zB = G.b(((N9.i) hVar).f8627f);
                        } else if (i10 == 3) {
                            zB = G.b(((N9.c) hVar).f8608f);
                        } else if (i10 != 4) {
                            Log.e("FIAM.Headless", "Unable to determine if impression should be counted as conversion.");
                        } else {
                            zB = G.b(((N9.g) hVar).f8621d);
                        }
                        z2 = !zB;
                    } else {
                        N9.e eVar = (N9.e) hVar;
                        boolean zB2 = G.b(eVar.f8615f);
                        boolean zB3 = G.b(eVar.f8616g);
                        if (!zB2 && !zB3) {
                            z2 = true;
                        }
                    }
                    g9.c(hVar, "fiam_impression", z2);
                }
                Iterator it = g9.f5882f.f5942e.values().iterator();
                if (it.hasNext()) {
                    throw M6.j(it);
                }
                return;
            case 1:
                C0656o c0656o2 = this.f5960b;
                final G g10 = (G) c0656o2.f5967g;
                g10.getClass();
                final N9.h hVar2 = (N9.h) c0656o2.f5969i;
                if (!hVar2.f8623b.f3290b) {
                    final int i11 = 1;
                    ((P9.c) g10.f5879c).d().addOnSuccessListener(g10.f5883g, new OnSuccessListener() { // from class: J9.E
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            String str = (String) obj;
                            switch (i11) {
                                case 0:
                                    EnumC4651t enumC4651t = EnumC4651t.IMPRESSION_EVENT_TYPE;
                                    N9.h hVar22 = hVar2;
                                    G g102 = g10;
                                    C4634b c4634bA = g102.a(hVar22, str);
                                    c4634bA.e(enumC4651t);
                                    g102.f5877a.b(((C4635c) c4634bA.build()).toByteArray());
                                    break;
                                default:
                                    EnumC4651t enumC4651t2 = EnumC4651t.CLICK_EVENT_TYPE;
                                    N9.h hVar3 = hVar2;
                                    G g11 = g10;
                                    C4634b c4634bA2 = g11.a(hVar3, str);
                                    c4634bA2.e(enumC4651t2);
                                    g11.f5877a.b(((C4635c) c4634bA2.build()).toByteArray());
                                    break;
                            }
                        }
                    });
                    g10.c(hVar2, "fiam_action", true);
                }
                Iterator it2 = g10.f5882f.f5939b.values().iterator();
                if (it2.hasNext()) {
                    throw M6.j(it2);
                }
                return;
            default:
                this.f5960b.f5961a = true;
                return;
        }
    }

    public /* synthetic */ C0655n(C0656o c0656o, N9.a aVar) {
        this.f5959a = 1;
        this.f5960b = c0656o;
    }
}
