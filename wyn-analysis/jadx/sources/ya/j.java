package ya;

import a2.v;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j7.C3088a;
import j7.C3089b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final d7.d[] f48055a = new d7.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final d7.d f48056b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzai f48057c;

    static {
        d7.d dVar = new d7.d("vision.barcode", 1L);
        d7.d dVar2 = new d7.d("vision.custom.ica", 1L);
        d7.d dVar3 = new d7.d("vision.face", 1L);
        d7.d dVar4 = new d7.d("vision.ica", 1L);
        d7.d dVar5 = new d7.d("vision.ocr", 1L);
        f48056b = dVar5;
        new d7.d("mlkit.ocr.chinese", 1L);
        new d7.d("mlkit.ocr.common", 1L);
        new d7.d("mlkit.ocr.devanagari", 1L);
        new d7.d("mlkit.ocr.japanese", 1L);
        new d7.d("mlkit.ocr.korean", 1L);
        d7.d dVar6 = new d7.d("mlkit.langid", 1L);
        d7.d dVar7 = new d7.d("mlkit.nlclassifier", 1L);
        d7.d dVar8 = new d7.d("tflite_dynamite", 1L);
        d7.d dVar9 = new d7.d("mlkit.barcode.ui", 1L);
        d7.d dVar10 = new d7.d("mlkit.smartreply", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza("barcode", dVar);
        zzahVar.zza("custom_ica", dVar2);
        zzahVar.zza("face", dVar3);
        zzahVar.zza("ica", dVar4);
        zzahVar.zza("ocr", dVar5);
        zzahVar.zza("langid", dVar6);
        zzahVar.zza("nlclassifier", dVar7);
        zzahVar.zza("tflite_dynamite", dVar8);
        zzahVar.zza("barcode_ui", dVar9);
        zzahVar.zza("smart_reply", dVar10);
        f48057c = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza("com.google.android.gms.vision.barcode", dVar);
        zzahVar2.zza("com.google.android.gms.vision.custom.ica", dVar2);
        zzahVar2.zza("com.google.android.gms.vision.face", dVar3);
        zzahVar2.zza("com.google.android.gms.vision.ica", dVar4);
        zzahVar2.zza("com.google.android.gms.vision.ocr", dVar5);
        zzahVar2.zza("com.google.android.gms.mlkit.langid", dVar6);
        zzahVar2.zza("com.google.android.gms.mlkit.nlclassifier", dVar7);
        zzahVar2.zza("com.google.android.gms.tflite_dynamite", dVar8);
        zzahVar2.zza("com.google.android.gms.mlkit_smartreply", dVar10);
        zzahVar2.zzb();
    }

    public static void a(Context context) {
        zzaf zzafVarZzh = zzaf.zzh("ocr");
        d7.f.f34129b.getClass();
        if (d7.f.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", zzafVarZzh));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        d7.d[] dVarArr = new d7.d[zzafVarZzh.size()];
        for (int i5 = 0; i5 < zzafVarZzh.size(); i5++) {
            d7.d dVar = (d7.d) f48057c.get(zzafVarZzh.get(i5));
            AbstractC1732v.i(dVar);
            dVarArr[i5] = dVar;
        }
        b(context, dVarArr);
    }

    public static void b(Context context, final d7.d[] dVarArr) {
        Task taskDoRead;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.android.gms.common.api.p() { // from class: ya.q
            @Override // com.google.android.gms.common.api.p
            public final d7.d[] a() {
                d7.d[] dVarArr2 = j.f48055a;
                return dVarArr;
            }
        });
        AbstractC1732v.a("APIs must not be empty.", !arrayList.isEmpty());
        j7.g gVar = new j7.g(context, null, j7.g.f38674a, com.google.android.gms.common.api.e.f26433X8, com.google.android.gms.common.api.k.f26561c);
        TreeSet treeSet = new TreeSet(C3089b.f38672a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((com.google.android.gms.common.api.p) it.next()).a());
        }
        C3088a c3088a = new C3088a(new ArrayList(treeSet), true, null, null);
        if (c3088a.f38668a.isEmpty()) {
            taskDoRead = Tasks.forResult(new i7.c(0, false));
        } else {
            N7.e eVarA = A.a();
            eVarA.f8591e = new d7.d[]{zav.zaa};
            eVarA.f8588b = true;
            eVarA.f8589c = 27304;
            eVarA.f8590d = new v(gVar, c3088a);
            taskDoRead = gVar.doRead(eVarA.e());
        }
        taskDoRead.addOnFailureListener(new ae.d(16));
    }
}
