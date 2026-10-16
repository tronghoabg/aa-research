package fd;

import a9.C1341a;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.InterfaceC4269f;

/* renamed from: fd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2630a implements InterfaceC3885b {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f35324a;

    /* renamed from: b, reason: collision with root package name */
    public final C1341a f35325b = new C1341a();

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor editorEdit = this.f35324a.edit();
        Map<String, ?> all = this.f35324a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    public final HashMap b(String str, List list) throws NumberFormatException {
        Object bigInteger;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f35324a.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object objValueOf = all.get(str2);
                boolean z2 = objValueOf instanceof String;
                C1341a c1341a = this.f35325b;
                if (z2) {
                    String str3 = (String) objValueOf;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        try {
                            objValueOf = (List) new J(new ByteArrayInputStream(Base64.decode(str3.substring(40), 0))).readObject();
                        } catch (IOException | ClassNotFoundException e7) {
                            throw new RuntimeException(e7);
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str3.substring(44), 36);
                        objValueOf = bigInteger;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        objValueOf = Double.valueOf(str3.substring(40));
                    }
                    map.put(str2, objValueOf);
                } else {
                    if (objValueOf instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) objValueOf);
                        this.f35324a.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c1341a.i(arrayList)).apply();
                        bigInteger = arrayList;
                        objValueOf = bigInteger;
                    }
                    map.put(str2, objValueOf);
                }
            }
        }
        return map;
    }

    public final Boolean c(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f35324a.edit().putString(str, str2).commit());
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        this.f35324a = c3884a.f44186a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            com.google.android.gms.internal.consent_sdk.a.H(interfaceC4269f, this);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        com.google.android.gms.internal.consent_sdk.a.H(c3884a.f44188c, null);
    }
}
