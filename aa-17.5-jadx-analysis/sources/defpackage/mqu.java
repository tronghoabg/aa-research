package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.view.View;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.apps.auto.components.telecom.impl.VoipUtilsImpl;
import com.google.android.apps.auto.components.troubleshooter.contentprovider.TroubleshooterContentProvider;
import com.google.android.apps.auto.components.ui.appbar.AppBarImpl;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class mqu implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mqu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.b) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v59, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v8, types: [afec, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                yph yphVar = mqv.a;
                return ((String) obj).equals(this.a);
            case 1:
                return ((ComponentName) this.a).equals((ComponentName) obj);
            case 2:
                yph yphVar2 = mrj.a;
                return !this.a.add((String) obj);
            case 3:
                ?? r3 = this.a;
                njj njjVar = njp.a;
                return ((Boolean) r3.invoke(obj)).booleanValue();
            case 4:
                return ((Boolean) this.a.invoke(obj)).booleanValue();
            case 5:
                ComponentName componentNameAl = roc.al((ResolveInfo) obj);
                if (componentNameAl == null) {
                    return false;
                }
                return ((nrz) this.a).g(componentNameAl);
            case 6:
                return ((nrz) this.a).g((ComponentName) obj);
            case 7:
                yph yphVar3 = oer.a;
                return ((String) this.a).equals(((BluetoothDevice) obj).getAddress());
            case 8:
                return this.a.contains((Integer) obj);
            case 9:
                return Objects.equals(((oep) this.a).a.i, ((BluetoothDevice) obj).getAddress());
            case 10:
                return ((String) this.a).equals((String) obj);
            case 11:
                yph yphVar4 = VoipUtilsImpl.a;
                return ((ComponentName) obj).getPackageName().equals(this.a);
            case 12:
                yph yphVar5 = VoipUtilsImpl.a;
                return ((ComponentName) obj).getPackageName().equals(this.a);
            case 13:
                yph yphVar6 = off.a;
                return ((CarCall) obj).a == ((ofe) this.a).a.a;
            case 14:
                Map mapA = ((TroubleshooterContentProvider) this.a).a();
                yxo yxoVarB = yxo.b(((oky) obj).d);
                if (yxoVarB == null) {
                    yxoVarB = yxo.DETECTOR_TYPE_UNSPECIFIED;
                }
                return mapA.containsKey(yxoVarB);
            case 15:
                yxo yxoVarB2 = yxo.b(((oky) obj).d);
                if (yxoVarB2 == null) {
                    yxoVarB2 = yxo.DETECTOR_TYPE_UNSPECIFIED;
                }
                return ((yxo) this.a).equals(yxoVarB2);
            case 16:
                return ((UUID) this.a).toString().equals(((oky) obj).c);
            case 17:
                return ((oky) obj).c.equals(((UUID) this.a).toString());
            case 18:
                yph yphVar7 = olf.a;
                return ((ComponentName) obj).getPackageName().equals(this.a);
            case 19:
                int i = AppBarImpl.r;
                return !((ygr) this.a).contains((View) obj);
            default:
                return ((Boolean) this.a.invoke(obj)).booleanValue();
        }
    }
}
