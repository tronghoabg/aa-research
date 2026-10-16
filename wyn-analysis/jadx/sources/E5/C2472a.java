package e5;

import B1.h;
import ef.C2527k;
import ff.AbstractC2641B;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import qc.C3884a;
import qc.InterfaceC3885b;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0002J\u001c\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/cloudacy/native_exif/NativeExifPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "classId", "", "interfaces", "", "Landroidx/exifinterface/media/ExifInterface;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "setAttributes", "exif", "values", "", "", "", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "onDetachedFromEngine", "binding", "native_exif_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2472a implements InterfaceC3885b, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f34425a;

    /* renamed from: b, reason: collision with root package name */
    public int f34426b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f34427c = new LinkedHashMap();

    public static void a(h hVar, Map map) throws NumberFormatException {
        if (map.containsKey("GPSLatitude") || map.containsKey("GPSLongitude")) {
            Object objValueOf = map.get("GPSLatitude");
            Object objValueOf2 = null;
            if (objValueOf == null) {
                double[] dArrI = hVar.i();
                objValueOf = dArrI != null ? Double.valueOf(dArrI[0]) : null;
            }
            Object obj = map.get("GPSLongitude");
            if (obj == null) {
                double[] dArrI2 = hVar.i();
                if (dArrI2 != null) {
                    objValueOf2 = Double.valueOf(dArrI2[1]);
                }
            } else {
                objValueOf2 = obj;
            }
            if (objValueOf instanceof String) {
                objValueOf = Double.valueOf(Double.parseDouble((String) objValueOf));
            } else if (!(objValueOf instanceof Double)) {
                throw new NumberFormatException("Invalid GPSLatitude value given. Must be of type Double or String.");
            }
            if (objValueOf2 instanceof String) {
                objValueOf2 = Double.valueOf(Double.parseDouble((String) objValueOf2));
            } else if (!(objValueOf2 instanceof Double)) {
                throw new NumberFormatException("Invalid GPSLongitude value given. Must be of type Double or String.");
            }
            double dDoubleValue = ((Number) objValueOf).doubleValue();
            double dDoubleValue2 = ((Number) objValueOf2).doubleValue();
            if (dDoubleValue < -90.0d || dDoubleValue > 90.0d || Double.isNaN(dDoubleValue)) {
                throw new IllegalArgumentException("Latitude value " + dDoubleValue + " is not valid.");
            }
            if (dDoubleValue2 < -180.0d || dDoubleValue2 > 180.0d || Double.isNaN(dDoubleValue2)) {
                throw new IllegalArgumentException("Longitude value " + dDoubleValue2 + " is not valid.");
            }
            hVar.G("GPSLatitudeRef", dDoubleValue >= 0.0d ? "N" : "S");
            hVar.G("GPSLatitude", h.b(Math.abs(dDoubleValue)));
            hVar.G("GPSLongitudeRef", dDoubleValue2 >= 0.0d ? "E" : "W");
            hVar.G("GPSLongitude", h.b(Math.abs(dDoubleValue2)));
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!AbstractC3340k.a(entry.getKey(), "GPSLatitude") && !AbstractC3340k.a(entry.getKey(), "GPSLongitude")) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                AbstractC3340k.c(value, "null cannot be cast to non-null type kotlin.String");
                hVar.G(str, (String) value);
            }
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a flutterPluginBinding) {
        AbstractC3340k.e(flutterPluginBinding, "flutterPluginBinding");
        C4281r c4281r = new C4281r(flutterPluginBinding.f44188c, "native_exif");
        this.f34425a = c4281r;
        c4281r.b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        C4281r c4281r = this.f34425a;
        if (c4281r != null) {
            c4281r.b(null);
        } else {
            AbstractC3340k.m("channel");
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) throws Throwable {
        AbstractC3340k.e(call, "call");
        String str = call.f46759a;
        if (str != null) {
            int iHashCode = str.hashCode();
            LinkedHashMap linkedHashMap = this.f34427c;
            switch (iHashCode) {
                case 3480550:
                    if (str.equals("getAttribute")) {
                        Integer num = (Integer) call.a("id");
                        String str2 = (String) call.a("tag");
                        if (num == null || str2 == null) {
                            ((g) interfaceC4280q).b("BAD_ARGUMENTS", "Bad arguments were given to this method.", null);
                            return;
                        }
                        h hVar = (h) linkedHashMap.get(num);
                        if (hVar == null) {
                            ((g) interfaceC4280q).b("NOT_FOUND", "Exif with given id was not found in memory", null);
                            return;
                        }
                        if (str2.equals("GPSLatitude")) {
                            double[] dArrI = hVar.i();
                            ((g) interfaceC4280q).a(dArrI != null ? Double.valueOf(Math.abs(dArrI[0])) : null);
                            return;
                        } else if (!str2.equals("GPSLongitude")) {
                            ((g) interfaceC4280q).a(hVar.d(str2));
                            return;
                        } else {
                            double[] dArrI2 = hVar.i();
                            ((g) interfaceC4280q).a(dArrI2 != null ? Double.valueOf(Math.abs(dArrI2[1])) : null);
                            return;
                        }
                    }
                    break;
                case 94756344:
                    if (str.equals("close")) {
                        Integer num2 = (Integer) call.a("id");
                        if (num2 == null) {
                            ((g) interfaceC4280q).b("BAD_ARGUMENTS", "Bad arguments were given to this method.", null);
                            return;
                        } else {
                            linkedHashMap.remove(num2);
                            ((g) interfaceC4280q).a(null);
                            return;
                        }
                    }
                    break;
                case 107897165:
                    if (str.equals("getAttributes")) {
                        Integer num3 = (Integer) call.a("id");
                        if (num3 == null) {
                            ((g) interfaceC4280q).b("BAD_ARGUMENTS", "Bad arguments were given to this method.", null);
                            return;
                        }
                        h hVar2 = (h) linkedHashMap.get(num3);
                        if (hVar2 == null) {
                            ((g) interfaceC4280q).b("NOT_FOUND", "Exif with given id was not found in memory", null);
                            return;
                        }
                        String[] strArr = {"Artist", "ApertureValue", "CustomRendered", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "DigitalZoomRatio", "ExposureTime", "ExposureProgram", "FNumber", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitudeRef", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageUniqueID", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "Software", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "UserComment", "WhiteBalance"};
                        HashMap map = new HashMap();
                        for (int i5 = 0; i5 < 32; i5++) {
                            String str3 = strArr[i5];
                            String strD = hVar2.d(str3);
                            if (strD != null) {
                                map.put(str3, strD);
                            }
                        }
                        double[] dArrI3 = hVar2.i();
                        if (dArrI3 != null) {
                            map.put("GPSLatitude", Double.valueOf(Math.abs(dArrI3[0])));
                            map.put("GPSLongitude", Double.valueOf(Math.abs(dArrI3[1])));
                        }
                        ((g) interfaceC4280q).a(map);
                        return;
                    }
                    break;
                case 268318037:
                    if (str.equals("initPath")) {
                        Object obj = call.f46760b;
                        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.String");
                        h hVar3 = new h((String) obj);
                        int i10 = this.f34426b;
                        this.f34426b = i10 + 1;
                        linkedHashMap.put(Integer.valueOf(i10), hVar3);
                        ((g) interfaceC4280q).a(Integer.valueOf(i10));
                        return;
                    }
                    break;
                case 882028377:
                    if (str.equals("setAttributes")) {
                        Integer num4 = (Integer) call.a("id");
                        Map map2 = (Map) call.a("values");
                        if (num4 == null || map2 == null) {
                            ((g) interfaceC4280q).b("BAD_ARGUMENTS", "Bad arguments were given to this method.", null);
                            return;
                        }
                        h hVar4 = (h) linkedHashMap.get(num4);
                        if (hVar4 == null) {
                            ((g) interfaceC4280q).b("NOT_FOUND", "Exif with given id was not found in memory", null);
                            return;
                        }
                        a(hVar4, map2);
                        hVar4.C();
                        ((g) interfaceC4280q).a(null);
                        return;
                    }
                    break;
                case 1552473178:
                    if (str.equals("setAttribute")) {
                        Integer num5 = (Integer) call.a("id");
                        String str4 = (String) call.a("tag");
                        String str5 = (String) call.a(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                        if (num5 == null || str4 == null || str5 == null) {
                            ((g) interfaceC4280q).b("BAD_ARGUMENTS", "Bad arguments were given to this method.", null);
                            return;
                        }
                        h hVar5 = (h) linkedHashMap.get(num5);
                        if (hVar5 == null) {
                            ((g) interfaceC4280q).b("NOT_FOUND", "Exif with given id was not found in memory", null);
                            return;
                        }
                        a(hVar5, AbstractC2641B.E(new C2527k(str4, str5)));
                        hVar5.C();
                        ((g) interfaceC4280q).a(null);
                        return;
                    }
                    break;
            }
        }
        ((g) interfaceC4280q).c();
    }
}
