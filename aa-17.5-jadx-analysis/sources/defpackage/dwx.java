package defpackage;

import android.os.RemoteException;
import android.util.Log;
import androidx.core.telecom.extensions.Capability;

/* loaded from: classes2.dex */
public final /* synthetic */ class dwx extends afey implements afeh {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwx(Object obj, int i) {
        super(3, obj, dyr.class, "onExchangeComplete", "onExchangeComplete$core_telecom(Landroidx/core/telecom/extensions/Capability;Landroidx/core/telecom/internal/CapabilityExchangeListenerRemote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws RemoteException {
        int i = this.a;
        if (i == 0) {
            return ((dyr) this.receiver).b((Capability) obj, (dyv) obj2, (afck) obj3);
        }
        if (i == 1) {
            Capability capability = (Capability) obj;
            dyv dyvVar = (dyv) obj2;
            afck afckVar = (afck) obj3;
            dxj dxjVar = (dxj) this.receiver;
            if (capability == null || dyvVar == null) {
                Log.i(dxj.b, "onNegotiated: remote is not capable");
                dxjVar.a(false);
                return afak.a;
            }
            dxjVar.a(true);
            aitg aitgVar = new aitg(affa.s(afckVar), 1);
            aitgVar.z();
            dyvVar.a(capability.b, capability.c, dxjVar.c.getPackageName(), new dxy(new dmz(dxjVar, 4), new dah(dxjVar, aitgVar, 4, null)));
            Object objK = aitgVar.k();
            afcr afcrVar = afcr.a;
            if (objK == afcrVar) {
                afckVar.getClass();
            }
            if (objK != afcrVar) {
                objK = afak.a;
            }
            return objK != afcrVar ? afak.a : objK;
        }
        if (i != 2) {
            if (i != 3) {
                ((ges) this.receiver).c(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                return afak.a;
            }
            ((gzr) this.receiver).a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            return afak.a;
        }
        Capability capability2 = (Capability) obj;
        dyv dyvVar2 = (dyv) obj2;
        afck afckVar2 = (afck) obj3;
        dyt dytVar = (dyt) this.receiver;
        String str = dyt.b;
        Log.i(str, "onExchangeComplete: in function");
        if (capability2 == null || dyvVar2 == null) {
            Log.i(str, "onNegotiated: remote is not capable");
            dytVar.a(false);
            return afak.a;
        }
        Log.i(str, "onExchangeComplete: isSupported");
        dytVar.a(true);
        aitg aitgVar2 = new aitg(affa.s(afckVar2), 1);
        aitgVar2.z();
        Log.d(str, "connectToRemote:");
        try {
            dyvVar2.c(capability2.b, new dyk(new dmz(dytVar, 7), new dmz(dytVar, 8), new dah(dytVar, aitgVar2, 6, null)));
        } catch (Exception e) {
            Log.e(dyt.b, "Error connecting to remote extension", e);
            if (aitgVar2.h()) {
                aitgVar2.w(woy.dE(e));
            }
        }
        Object objK2 = aitgVar2.k();
        afcr afcrVar2 = afcr.a;
        if (objK2 == afcrVar2) {
            afckVar2.getClass();
        }
        if (objK2 != afcrVar2) {
            objK2 = afak.a;
        }
        return objK2 != afcrVar2 ? afak.a : objK2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwx(Object obj, int i, byte[] bArr) {
        super(3, obj, dxj.class, "onExchangeComplete", "onExchangeComplete$core_telecom(Landroidx/core/telecom/extensions/Capability;Landroidx/core/telecom/internal/CapabilityExchangeListenerRemote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwx(Object obj, int i, char[] cArr) {
        super(3, obj, dyt.class, "onExchangeComplete", "onExchangeComplete$core_telecom(Landroidx/core/telecom/extensions/Capability;Landroidx/core/telecom/internal/CapabilityExchangeListenerRemote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwx(Object obj, int i, int[] iArr) {
        super(3, obj, ges.class, "onScale", "onScale(FFF)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwx(Object obj, int i, short[] sArr) {
        super(3, obj, gzr.class, "updateStoredScrollPosition", "updateStoredScrollPosition(IIZ)V", 0);
        this.a = i;
    }
}
