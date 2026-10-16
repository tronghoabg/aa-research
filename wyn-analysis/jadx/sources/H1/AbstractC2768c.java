package h1;

import a1.AbstractC1312b;
import a2.v;
import ad.L;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import x.C4417j;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2768c {

    /* renamed from: a, reason: collision with root package name */
    public static final C4417j f35938a = new C4417j(2);

    /* renamed from: b, reason: collision with root package name */
    public static final A0.f f35939b = new A0.f(15);

    public static Y2.f a(Context context, List list) {
        Trace.beginSection(tg.b.U("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < list.size(); i5++) {
                d dVar = (d) list.get(i5);
                ProviderInfo providerInfoB = b(context.getPackageManager(), dVar, context.getResources());
                if (providerInfoB == null) {
                    return new Y2.f();
                }
                arrayList.add(c(context, dVar, providerInfoB.authority));
            }
            return new Y2.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        Trace.beginSection(tg.b.U("FontProvider.getProvider"));
        try {
            List listM = dVar.f35943d;
            String str = dVar.f35940a;
            String str2 = dVar.f35941b;
            if (listM == null) {
                listM = AbstractC1312b.m(resources, 0);
            }
            C2767b c2767b = new C2767b();
            c2767b.f35935a = str;
            c2767b.f35936b = str2;
            c2767b.f35937c = listM;
            C4417j c4417j = f35938a;
            ProviderInfo providerInfo = (ProviderInfo) c4417j.get(c2767b);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            A0.f fVar = f35939b;
            Collections.sort(arrayList, fVar);
            for (int i5 = 0; i5 < listM.size(); i5++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM.get(i5));
                Collections.sort(arrayList2, fVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                    }
                    c4417j.put(c2767b, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, d dVar, String str) {
        Trace.beginSection(tg.b.U("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            InterfaceC2766a vVar = Build.VERSION.SDK_INT < 24 ? new v(context, uriBuild) : new L(context, uriBuild);
            Cursor cursorC = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(tg.b.U("ContentQueryWrapper.query"));
                try {
                    cursorC = vVar.c(uriBuild, strArr, new String[]{dVar.f35942c});
                    Trace.endSection();
                    if (cursorC != null && cursorC.getCount() > 0) {
                        int columnIndex = cursorC.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorC.getColumnIndex("_id");
                        int columnIndex3 = cursorC.getColumnIndex("file_id");
                        int columnIndex4 = cursorC.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorC.getColumnIndex("font_weight");
                        int columnIndex6 = cursorC.getColumnIndex("font_italic");
                        while (cursorC.moveToNext()) {
                            int i5 = columnIndex != -1 ? cursorC.getInt(columnIndex) : 0;
                            arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorC.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorC.getLong(columnIndex3)), columnIndex4 != -1 ? cursorC.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorC.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorC.getInt(columnIndex6) == 1, i5));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorC != null) {
                        cursorC.close();
                    }
                    vVar.close();
                    return (i[]) arrayList.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorC != null) {
                    cursorC.close();
                }
                vVar.close();
                throw th;
            }
        } finally {
        }
    }
}
