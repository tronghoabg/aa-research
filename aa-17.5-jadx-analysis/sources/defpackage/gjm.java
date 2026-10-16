package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Pair;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.model.CarText;
import com.google.android.gms.car.control.CarAreaId;
import com.google.android.gms.car.control.CarAreaIdConfig;
import com.google.android.gms.car.control.CarControlGroup;
import com.google.android.gms.car.display.integratedoverlay.OverlayParameters;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;
import mesquite.messaging.model.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class gjm implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gjm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v70, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        lpo lpoVar = null;
        switch (this.b) {
            case 0:
                return this.a.invoke(obj);
            case 1:
                return this.a.invoke(obj);
            case 2:
                xfz xfzVar = (xfz) obj;
                yph yphVar = ijv.a;
                xgj xgjVar = xfzVar.c;
                if (xgjVar == null) {
                    xgjVar = xgj.f;
                }
                CarAreaId carAreaIdA = CarAreaId.a(xgjVar);
                xgq xgqVar = xfzVar.e;
                if (xgqVar == null) {
                    xgqVar = xgq.a;
                }
                Class cls = (Class) this.a;
                Object objG = ijv.g(xgqVar, cls);
                xgq xgqVar2 = xfzVar.d;
                if (xgqVar2 == null) {
                    xgqVar2 = xgq.a;
                }
                return new CarAreaIdConfig(carAreaIdA, objG, ijv.g(xgqVar2, cls));
            case 3:
                return Collection.EL.stream(((ijv) this.a).h((CarControlGroup) obj));
            case 4:
                return ((ikp) this.a).j((xmw) obj);
            case 5:
                return ((rqd) this.a).c((yxy) obj);
            case 6:
                OverlayParameters overlayParameters = (OverlayParameters) obj;
                int i = overlayParameters.a;
                float f = ((ivf) this.a).c.l;
                Rect rect = overlayParameters.b;
                ygr ygrVar = ivk.a;
                Rect rect2 = new Rect(rect);
                double d = f;
                if (d < 1.0d) {
                    rect2.top = Math.round(rect.top * f);
                    rect2.bottom = Math.round(rect.bottom * f);
                } else if (d > 1.0d) {
                    rect2.left = Math.round(rect.left / f);
                    rect2.right = Math.round(rect.right / f);
                }
                return new OverlayParameters(i, rect2, overlayParameters.c);
            case 7:
                String str = (String) obj;
                List listI = iyj.a.i(str);
                if (listI.size() != 2) {
                    ((ype) ((ype) iyj.b.h()).ai((char) 1639)).y("Invalid flag entry for trusted 3p installer [%s]", str);
                    return null;
                }
                Object obj2 = this.a;
                String str2 = (String) listI.get(0);
                if (iyi.a((PackageManager) obj2, str2, (String) listI.get(1))) {
                    return str2;
                }
                return null;
            case 8:
                return this.a.invoke(obj);
            case 9:
                return this.a.invoke(obj);
            case 10:
                return ((jsd) this.a).a((Pair) obj);
            case 11:
                Message message = (Message) obj;
                int i2 = jxt.a;
                sp spVar = new sp();
                spVar.b = CarText.create(message.b);
                spVar.e = message.f;
                spVar.c = message.c;
                spVar.d = message.d;
                spVar.a = jxt.b(message.e);
                spVar.f = ((lug) this.a).f;
                String str3 = spVar.c;
                if (((str3 == null ? 1 : 0) ^ (spVar.d != null ? 0 : 1)) != 0) {
                    throw new IllegalStateException("Incomplete multimedia data detected in CarMessage. Please be sure to provide both MIME type and URI for multimedia messages.");
                }
                if (spVar.b == null && str3 == null) {
                    throw new IllegalStateException("Message must have content. Please provide body text, multimedia data (URI + MIME type), or both.");
                }
                return new CarMessage(spVar);
            case 12:
                return new kom((Enum) this.a);
            case 13:
                return new kom((Enum) this.a);
            case 14:
                kqg kqgVar = (kqg) obj;
                Stream stream = Collection.EL.stream(this.a);
                kqgVar.getClass();
                Optional optionalFindFirst = stream.filter(new koh(kqgVar, 5)).findFirst();
                if (kqgVar.a.isPresent() || optionalFindFirst.isEmpty()) {
                    return kqgVar;
                }
                kqf kqfVar = new kqf(kqgVar);
                kqfVar.c(((kqg) optionalFindFirst.get()).a);
                return kqfVar.a();
            case 15:
                kzx kzxVar = new kzx(0);
                String str4 = ((osd) obj).c;
                woy.O(!str4.isEmpty(), "Only Icons with URIs are supported for icon spans interleaved with text");
                Uri uri = Uri.parse(str4);
                boolean zEquals = "android.resource".equals(uri.getScheme());
                Object obj3 = this.a;
                if (!zEquals) {
                    return new obo((Context) obj3, uri);
                }
                String strC = kzd.c(uri);
                try {
                    return new obo(((Context) obj3).createPackageContext(strC, 0), kzd.b(uri, kzxVar, (Context) obj3));
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException("Context not found for ".concat(strC), e);
                }
            case 16:
                return new lnq((lnr) this.a, (String) obj);
            case 17:
                return ((loy) this.a).h((ComponentName) obj);
            case 18:
                return new lop(((loy) this.a).b, (ComponentName) obj).a();
            case 19:
                lmb lmbVar = (lmb) obj;
                ?? r9 = this.a;
                ComponentName componentNameA = lpq.a(lmbVar);
                if (!lpq.k()) {
                    return (eqj) Map.EL.computeIfAbsent(r9, componentNameA, new lpc(lmbVar, i));
                }
                eqj eqjVar = (eqj) r9.get(componentNameA);
                if (eqjVar != null) {
                    return eqjVar;
                }
                try {
                    lmbVar.P();
                    lpoVar = new lpo(lmbVar);
                } catch (SecurityException e2) {
                    ((ype) ((ype) ((ype) lpq.a.h()).p(e2)).ai((char) 4158)).y("SecurityException when trying to create MediaSessionStateLiveData for %s", lmbVar.R());
                }
                if (lpoVar != null) {
                    r9.put(componentNameA, lpoVar);
                }
                return lpoVar;
            default:
                return lpq.h((qrn) this.a, (lpf) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
