package Ka;

import A5.h;
import A7.CallableC0305y0;
import Ea.f;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.InterfaceC1456u;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions;
import com.google.mlkit.vision.text.devanagari.DevanagariTextRecognizerOptions;
import com.google.mlkit.vision.text.japanese.JapaneseTextRecognizerOptions;
import com.google.mlkit.vision.text.korean.KoreanTextRecognizerOptions;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import tc.g;
import uc.C4278o;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* loaded from: classes4.dex */
public final class c implements InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6713a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6714b = new HashMap();

    public c(Context context) {
        this.f6713a = context;
    }

    public static void a(HashMap map, String str, Rect rect, Point[] pointArr, String str2, Float f10, Float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        ArrayList arrayList2 = new ArrayList();
        for (Point point : pointArr) {
            HashMap map2 = new HashMap();
            map2.put("x", Integer.valueOf(point.x));
            map2.put("y", Integer.valueOf(point.y));
            arrayList2.add(map2);
        }
        map.put("points", arrayList2);
        HashMap map3 = new HashMap();
        map3.put("left", Integer.valueOf(rect.left));
        map3.put("right", Integer.valueOf(rect.right));
        map3.put("top", Integer.valueOf(rect.top));
        map3.put("bottom", Integer.valueOf(rect.bottom));
        map.put("rect", map3);
        map.put("recognizedLanguages", arrayList);
        map.put("text", str);
        map.put("confidence", f10);
        map.put("angle", f11);
    }

    public static f b(C4278o c4278o) {
        Integer num = (Integer) c4278o.a("script");
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return Ba.c.v(Fa.a.f4033c);
        }
        if (iIntValue == 1) {
            return Ba.c.v(new ChineseTextRecognizerOptions.Builder().build());
        }
        if (iIntValue == 2) {
            return Ba.c.v(new DevanagariTextRecognizerOptions.Builder().build());
        }
        if (iIntValue == 3) {
            return Ba.c.v(new JapaneseTextRecognizerOptions.Builder().build());
        }
        if (iIntValue != 4) {
            return null;
        }
        return Ba.c.v(new KoreanTextRecognizerOptions.Builder().build());
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Aa.a aVarA;
        Task taskForException;
        int i5 = 0;
        boolean z2 = false;
        int i10 = 3;
        String str = c4278o.f46759a;
        str.getClass();
        if (!str.equals("vision#startTextRecognizer")) {
            if (!str.equals("vision#closeTextRecognizer")) {
                ((g) interfaceC4280q).c();
                return;
            }
            String str2 = (String) c4278o.a("id");
            HashMap map = this.f6714b;
            InterfaceC1456u interfaceC1456u = (Ca.g) map.get(str2);
            if (interfaceC1456u != null) {
                ((Ba.b) interfaceC1456u).close();
                map.remove(str2);
            }
            ((g) interfaceC4280q).a(null);
            return;
        }
        Map map2 = (Map) c4278o.a("imageData");
        if (map2 == null) {
            return;
        }
        Context context = this.f6713a;
        String str3 = (String) map2.get("type");
        if (str3 == null || !str3.equals("file")) {
            if (str3 == null || !str3.equals("bytes")) {
                ((g) interfaceC4280q).b("InputImageConverterError", "Invalid Input Image", null);
            } else {
                try {
                    Map map3 = (Map) map2.get(ExternalParsersConfigReaderMetKeys.METADATA_TAG);
                    Object obj = map2.get("bytes");
                    Objects.requireNonNull(obj);
                    byte[] bArr = (byte[]) obj;
                    Object obj2 = map3.get("width");
                    Objects.requireNonNull(obj2);
                    int iIntValue = Double.valueOf(obj2.toString()).intValue();
                    Object obj3 = map3.get("height");
                    Objects.requireNonNull(obj3);
                    int iIntValue2 = Double.valueOf(obj3.toString()).intValue();
                    Object obj4 = map3.get("rotation");
                    Objects.requireNonNull(obj4);
                    int i11 = Integer.parseInt(obj4.toString());
                    Object obj5 = map3.get("image_format");
                    Objects.requireNonNull(obj5);
                    int i12 = Integer.parseInt(obj5.toString());
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Aa.a aVar = new Aa.a(ByteBuffer.wrap(bArr), iIntValue, iIntValue2, i11, i12);
                    zzmu.zza(zzms.zzb("vision-common"), i12, 2, jElapsedRealtime, iIntValue2, iIntValue, bArr.length, i11);
                    aVarA = aVar;
                } catch (Exception e7) {
                    Log.e("ImageError", "Getting Image failed");
                    Log.e("ImageError", e7.toString());
                    ((g) interfaceC4280q).b("InputImageConverterError", e7.toString(), null);
                }
            }
            aVarA = null;
        } else {
            try {
                aVarA = Aa.a.a(context, Uri.fromFile(new File((String) map2.get("path"))));
            } catch (IOException e10) {
                Log.e("ImageError", "Getting Image failed");
                Log.e("ImageError", e10.toString());
                ((g) interfaceC4280q).b("InputImageConverterError", e10.toString(), null);
            }
        }
        if (aVarA == null) {
            return;
        }
        String str4 = (String) c4278o.a("id");
        Ca.g gVar = (Ca.g) this.f6714b.get(str4);
        Ca.g gVar2 = gVar;
        if (gVar == null) {
            f fVarB = b(c4278o);
            this.f6714b.put(str4, fVarB);
            gVar2 = fVarB;
        }
        if (gVar2 == null) {
            ((g) interfaceC4280q).b("TextRecognizerError", "TextRecognizer is not initialized", null);
            return;
        }
        f fVar = (f) gVar2;
        synchronized (fVar) {
            taskForException = fVar.f1649a.get() ? Tasks.forException(new ua.a("This detector is already closed!", 14)) : (aVarA.f1249c < 32 || aVarA.f1250d < 32) ? Tasks.forException(new ua.a("InputImage width and height should be at least 32!", 3)) : fVar.f1650b.b(fVar.f1652d, new CallableC0305y0(fVar, z2 ? 1 : 0, aVarA, i10), fVar.f1651c.getToken());
        }
        g gVar3 = (g) interfaceC4280q;
        taskForException.addOnSuccessListener(new h(15, this, gVar3)).addOnFailureListener(new b(gVar3, i5));
    }
}
