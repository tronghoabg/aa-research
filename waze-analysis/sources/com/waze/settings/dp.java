package com.waze.settings;

import com.waze.sharedui.profile.UserProfile;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dp extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37053a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f37054b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f37055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dp(bf bfVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f37055c) {
            case 0:
                dp dpVar = new dp((ds) this.f37054b, eVar, 0);
                dpVar.f37053a = obj;
                return dpVar;
            case 1:
                dp dpVar2 = new dp((bf) this.f37054b, eVar, 1);
                dpVar2.f37053a = obj;
                return dpVar2;
            case 2:
                dp dpVar3 = new dp((ds) this.f37054b, eVar, 2, (byte[]) null);
                dpVar3.f37053a = obj;
                return dpVar3;
            case 3:
                dp dpVar4 = new dp((ds) this.f37054b, eVar, 3, (char[]) null);
                dpVar4.f37053a = obj;
                return dpVar4;
            case 4:
                dp dpVar5 = new dp((ds) this.f37054b, eVar, 4, (short[]) null);
                dpVar5.f37053a = obj;
                return dpVar5;
            case 5:
                dp dpVar6 = new dp((ds) this.f37054b, eVar, 5, (int[]) null);
                dpVar6.f37053a = obj;
                return dpVar6;
            case 6:
                dp dpVar7 = new dp((ds) this.f37054b, eVar, 6, (boolean[]) null);
                dpVar7.f37053a = obj;
                return dpVar7;
            case 7:
                dp dpVar8 = new dp((ds) this.f37054b, eVar, 7, (float[]) null);
                dpVar8.f37053a = obj;
                return dpVar8;
            default:
                dp dpVar9 = new dp((ds) this.f37054b, eVar, 8, (byte[][]) null);
                dpVar9.f37053a = obj;
                return dpVar9;
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f37055c) {
            case 0:
                return ((dp) create(obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 1:
                return ((dp) create((be) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 2:
                return ((dp) create(obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 3:
                return ((dp) create(obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 4:
                return ((dp) create(obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 5:
                return ((dp) create(obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 6:
                return ((dp) create(obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 7:
                return ((dp) create((UserProfile) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            default:
                return ((dp) create((c) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
        }
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Boolean bool;
        Object objD2;
        Boolean bool2;
        Object objD3;
        Boolean bool3;
        Object objD4;
        Boolean bool4;
        Object objD5;
        Boolean bool5;
        Object objD6;
        Boolean bool6;
        Object objD7;
        switch (this.f37055c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                e.b.c.b(obj);
                Object obj2 = this.f37054b;
                Object obj3 = this.f37053a;
                kotlinx.coroutines.b.bn bnVar = ((ds) obj2).x;
                do {
                    objD = bnVar.d();
                    bool = (Boolean) obj3;
                    h.g.b.x.c(bool);
                } while (!bnVar.f(objD, bs.B((bs) objD, 0, false, false, bool.booleanValue(), false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217719)));
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                be beVar = (be) this.f37053a;
                com.waze.shared_infra.i.e eVarA = ((bf) this.f37054b).a();
                Objects.toString(beVar);
                eVarA.a("state updated: ".concat(String.valueOf(beVar)));
                break;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                Object obj4 = this.f37054b;
                Object obj5 = this.f37053a;
                kotlinx.coroutines.b.bn bnVar2 = ((ds) obj4).x;
                do {
                    objD2 = bnVar2.d();
                    bool2 = (Boolean) obj5;
                    h.g.b.x.c(bool2);
                } while (!bnVar2.f(objD2, bs.B((bs) objD2, 0, false, false, false, bool2.booleanValue(), false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217711)));
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                Object obj6 = this.f37054b;
                Object obj7 = this.f37053a;
                kotlinx.coroutines.b.bn bnVar3 = ((ds) obj6).x;
                do {
                    objD3 = bnVar3.d();
                    bool3 = (Boolean) obj7;
                    h.g.b.x.c(bool3);
                } while (!bnVar3.f(objD3, bs.B((bs) objD3, 0, false, false, false, false, false, bool3.booleanValue(), false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217663)));
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                Object obj8 = this.f37054b;
                Object obj9 = this.f37053a;
                kotlinx.coroutines.b.bn bnVar4 = ((ds) obj8).x;
                do {
                    objD4 = bnVar4.d();
                    bool4 = (Boolean) obj9;
                    h.g.b.x.c(bool4);
                } while (!bnVar4.f(objD4, bs.B((bs) objD4, 0, false, false, false, false, false, false, bool4.booleanValue(), false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217599)));
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                Object obj10 = this.f37054b;
                Object obj11 = this.f37053a;
                kotlinx.coroutines.b.bn bnVar5 = ((ds) obj10).x;
                do {
                    objD5 = bnVar5.d();
                    bool5 = (Boolean) obj11;
                    h.g.b.x.c(bool5);
                } while (!bnVar5.f(objD5, bs.B((bs) objD5, 0, false, false, false, false, false, false, false, bool5.booleanValue(), false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217471)));
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                Object obj12 = this.f37054b;
                Object obj13 = this.f37053a;
                kotlinx.coroutines.b.bn bnVar6 = ((ds) obj12).x;
                do {
                    objD6 = bnVar6.d();
                    bool6 = (Boolean) obj13;
                    h.g.b.x.c(bool6);
                } while (!bnVar6.f(objD6, bs.B((bs) objD6, 0, false, false, false, false, false, false, false, false, bool6.booleanValue(), null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 134217215)));
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                UserProfile userProfile = (UserProfile) this.f37053a;
                h.g.b.x.c(userProfile);
                ds.C((ds) this.f37054b, userProfile);
                break;
            default:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                c cVar = (c) this.f37053a;
                kotlinx.coroutines.b.bn bnVar7 = ((ds) this.f37054b).x;
                do {
                    objD7 = bnVar7.d();
                } while (!bnVar7.f(objD7, bs.B((bs) objD7, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, cVar, false, null, 117440511)));
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ds dsVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = dsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ds dsVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = dsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ds dsVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = dsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dp(ds dsVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = dsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ds dsVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = dsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ds dsVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = dsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ds dsVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = dsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dp(ds dsVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f37055c = i2;
        this.f37054b = dsVar;
    }
}
