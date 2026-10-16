package com.waze.ab.a;

import android.net.Uri;
import androidx.compose.material.ModalBottomSheetState;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.bm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f13753a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f13754b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f13755c = i2;
        this.f13754b = modalBottomSheetState;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f13755c;
        if (i2 == 0) {
            return new y((ad) this.f13754b, eVar, 0);
        }
        if (i2 == 1) {
            return new y((ModalBottomSheetState) this.f13754b, eVar, 1);
        }
        if (i2 == 2) {
            return new y((ad) this.f13754b, eVar, 2, (byte[]) null);
        }
        if (i2 == 3) {
            return new y((ad) this.f13754b, eVar, 3, (char[]) null);
        }
        if (i2 == 4) {
            return new y((ad) this.f13754b, eVar, 4, (short[]) null);
        }
        Object obj2 = this.f13754b;
        return i2 != 5 ? new y((ad) obj2, eVar, 6, (boolean[]) null) : new y((ad) obj2, eVar, 5, (int[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f13755c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f13755c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f13753a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f13753a = 1;
                if (((ad) this.f13754b).n.emit(s.f13748a, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f13753a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f13754b;
                this.f13753a = 1;
                if (((ModalBottomSheetState) obj2).hide(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        Uri uri = null;
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f13753a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f13753a = 1;
                obj = aj.v(av.a(), new z((ad) this.f13754b, null), this);
                if (obj == aVar3) {
                    return aVar3;
                }
            }
            String str = (String) obj;
            Object obj3 = this.f13754b;
            if (str != null) {
                ((ad) obj3).E();
            } else {
                ((ad) obj3).D();
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f13753a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f13753a = 1;
                if (((ad) this.f13754b).n.emit(t.f13749a, this) == aVar4) {
                    return aVar4;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f13753a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f13753a = 1;
                if (((ad) this.f13754b).n.emit(u.f13750a, this) == aVar5) {
                    return aVar5;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 5) {
            h.c.a.a aVar6 = h.c.a.a.f48038a;
            if (this.f13753a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f13753a = 1;
                if (((ad) this.f13754b).n.emit(v.f13751a, this) == aVar6) {
                    return aVar6;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar7 = h.c.a.a.f48038a;
        if (this.f13753a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ad adVar = (ad) this.f13754b;
            bm bmVar = adVar.n;
            Uri uri2 = adVar.m;
            if (uri2 == null) {
                h.g.b.x.j("photoUri");
            } else {
                uri = uri2;
            }
            this.f13753a = 1;
            if (bmVar.emit(new w(uri), this) == aVar7) {
                return aVar7;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ad adVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f13755c = i2;
        this.f13754b = adVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ad adVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f13755c = i2;
        this.f13754b = adVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ad adVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f13755c = i2;
        this.f13754b = adVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ad adVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f13755c = i2;
        this.f13754b = adVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ad adVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f13755c = i2;
        this.f13754b = adVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ad adVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f13755c = i2;
        this.f13754b = adVar;
    }
}
