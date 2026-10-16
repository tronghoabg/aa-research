package x0;

import X0.E;
import ef.InterfaceC2521e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import t0.y;
import u0.C4188n;

/* renamed from: x0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4438h extends E {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4438h(y wrapped, InterfaceC4439i modifier) {
        super(wrapped, modifier);
        AbstractC3340k.e(wrapped, "wrapped");
        AbstractC3340k.e(modifier, "modifier");
    }

    @Override // X0.E
    public final void g() {
        this.f15787a = true;
        C4188n c4188n = ((y) this.f15788b).f45561e.f45517g;
        if (c4188n != null) {
            c4188n.o();
        }
    }

    @Override // X0.E
    public final void h() {
        this.f15787a = false;
        C4188n c4188n = ((y) this.f15788b).f45561e.f45517g;
        if (c4188n != null) {
            c4188n.o();
        }
    }

    public final C4437g j() {
        C4438h c4438h = (C4438h) ((E) this.f15790d);
        C4438h c4438h2 = null;
        if (c4438h == null) {
            y yVarN = ((y) this.f15788b).N();
            if (yVarN != null) {
                while (yVarN != null && !Fe.e.H(yVarN.f45574s, 2)) {
                    yVarN = yVarN.N();
                }
                if (yVarN != null && (c4438h = (C4438h) yVarN.f45574s[2]) != null) {
                    y yVarN2 = (y) c4438h.f15788b;
                    while (yVarN2 != null) {
                        if (c4438h != null) {
                            c4438h2 = c4438h;
                            break;
                        }
                        yVarN2 = yVarN2.N();
                        c4438h = yVarN2 != null ? (C4438h) yVarN2.f45574s[2] : null;
                    }
                }
            }
        } else {
            y yVarN3 = (y) c4438h.f15788b;
            while (yVarN3 != null) {
                if (c4438h != null) {
                    c4438h2 = c4438h;
                    break;
                }
                yVarN3 = yVarN3.N();
                c4438h = yVarN3 != null ? (C4438h) yVarN3.f45574s[2] : null;
            }
        }
        Z.j jVar = (Z.j) this.f15789c;
        if (c4438h2 != null) {
            C4437g c4437g = ((C4440j) ((InterfaceC4439i) jVar)).f47598b;
            if (!c4437g.f47595c) {
                c4437g.getClass();
                C4437g c4437g2 = new C4437g();
                c4437g2.f47594b = c4437g.f47594b;
                c4437g2.f47595c = c4437g.f47595c;
                LinkedHashMap linkedHashMap = c4437g2.f47593a;
                linkedHashMap.putAll(c4437g.f47593a);
                C4437g peer = c4438h2.j();
                AbstractC3340k.e(peer, "peer");
                if (peer.f47594b) {
                    c4437g2.f47594b = true;
                }
                if (peer.f47595c) {
                    c4437g2.f47595c = true;
                }
                for (Map.Entry entry : peer.f47593a.entrySet()) {
                    C4447q c4447q = (C4447q) entry.getKey();
                    Object value = entry.getValue();
                    if (!linkedHashMap.containsKey(c4447q)) {
                        linkedHashMap.put(c4447q, value);
                    } else if (value instanceof C4431a) {
                        Object obj = linkedHashMap.get(c4447q);
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                        }
                        C4431a c4431a = (C4431a) obj;
                        String str = c4431a.f47567a;
                        if (str == null) {
                            str = ((C4431a) value).f47567a;
                        }
                        InterfaceC2521e interfaceC2521e = c4431a.f47568b;
                        if (interfaceC2521e == null) {
                            interfaceC2521e = ((C4431a) value).f47568b;
                        }
                        linkedHashMap.put(c4447q, new C4431a(str, interfaceC2521e));
                    } else {
                        continue;
                    }
                }
                return c4437g2;
            }
        }
        return ((C4440j) ((InterfaceC4439i) jVar)).f47598b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" id: ");
        C4440j c4440j = (C4440j) ((InterfaceC4439i) ((Z.j) this.f15789c));
        sb2.append(c4440j.f47597a);
        sb2.append(" config: ");
        sb2.append(c4440j.f47598b);
        return sb2.toString();
    }
}
