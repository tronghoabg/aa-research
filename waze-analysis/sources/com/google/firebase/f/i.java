package com.google.firebase.f;

import android.content.Context;
import android.content.SharedPreferences;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f9897a;

    public i(Context context, String str) {
        this.f9897a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    private final synchronized String i(long j2) {
        return DateRetargetClass.toInstant(new Date(j2)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private final synchronized String j(String str) {
        for (Map.Entry<String, ?> entry : this.f9897a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private final synchronized void k() {
        SharedPreferences sharedPreferences = this.f9897a;
        long j2 = sharedPreferences.getLong("fire-count", 0L);
        String key = "";
        String str = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        sharedPreferences.edit().putStringSet(key, hashSet).putLong("fire-count", j2 - 1).commit();
    }

    private final synchronized void l(String str) {
        String strJ = j(str);
        if (strJ == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.f9897a;
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(strJ, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            sharedPreferences.edit().remove(strJ).commit();
        } else {
            sharedPreferences.edit().putStringSet(strJ, hashSet).commit();
        }
    }

    private final synchronized void m(String str, String str2) {
        l(str2);
        HashSet hashSet = new HashSet();
        SharedPreferences sharedPreferences = this.f9897a;
        HashSet hashSet2 = new HashSet(sharedPreferences.getStringSet(str, hashSet));
        hashSet2.add(str2);
        sharedPreferences.edit().putStringSet(str, hashSet2).commit();
    }

    final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f9897a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(i(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new j(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        e(System.currentTimeMillis());
        return arrayList;
    }

    final synchronized void b() {
        SharedPreferences sharedPreferences = this.f9897a;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i2 = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String strI = i(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(strI)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(strI);
                    editorEdit.putStringSet(key, hashSet);
                    i2++;
                } else {
                    editorEdit.remove(key);
                }
            }
        }
        if (i2 == 0) {
            editorEdit.remove("fire-count");
        } else {
            editorEdit.putLong("fire-count", i2);
        }
        editorEdit.commit();
    }

    final synchronized void c() {
        String strI = i(System.currentTimeMillis());
        this.f9897a.edit().putString("last-used-date", strI).commit();
        l(strI);
    }

    final synchronized void d(long j2, String str) {
        SharedPreferences sharedPreferences = this.f9897a;
        String strI = i(j2);
        if (sharedPreferences.getString("last-used-date", "").equals(strI)) {
            String strJ = j(strI);
            if (strJ != null && !strJ.equals(str)) {
                m(str, strI);
                return;
            }
            return;
        }
        long j3 = sharedPreferences.getLong("fire-count", 0L);
        if (j3 + 1 == 30) {
            k();
            j3 = sharedPreferences.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(str, new HashSet()));
        hashSet.add(strI);
        sharedPreferences.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", strI).commit();
    }

    final synchronized void e(long j2) {
        this.f9897a.edit().putLong("fire-global", j2).commit();
    }

    final synchronized boolean f(long j2, long j3) {
        return i(j2).equals(i(j3));
    }

    final synchronized boolean g(long j2) {
        return h(j2);
    }

    final synchronized boolean h(long j2) {
        SharedPreferences sharedPreferences = this.f9897a;
        if (!sharedPreferences.contains("fire-global")) {
            sharedPreferences.edit().putLong("fire-global", j2).commit();
            return true;
        }
        if (f(sharedPreferences.getLong("fire-global", -1L), j2)) {
            return false;
        }
        sharedPreferences.edit().putLong("fire-global", j2).commit();
        return true;
    }
}
