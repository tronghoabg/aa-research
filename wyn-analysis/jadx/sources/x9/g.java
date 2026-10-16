package x9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f47870a;

    public g(Context context, String str) {
        this.f47870a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j8 = this.f47870a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f47870a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f47870a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f47870a.edit().putStringSet(key, hashSet).putLong("fire-count", j8 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f47870a.edit();
            int i5 = 0;
            for (Map.Entry<String, ?> entry : this.f47870a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strD = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strD)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strD);
                        i5++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i5 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i5);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f47870a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C4501a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j8) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j8)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j8));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f47870a.getAll().entrySet()) {
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

    public final synchronized boolean f(long j8, long j10) {
        return d(j8).equals(d(j10));
    }

    public final synchronized void g() {
        String strD = d(System.currentTimeMillis());
        this.f47870a.edit().putString("last-used-date", strD).commit();
        h(strD);
    }

    public final synchronized void h(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f47870a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f47870a.edit().remove(strE).commit();
            } else {
                this.f47870a.edit().putStringSet(strE, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j8) {
        return j(j8);
    }

    public final synchronized boolean j(long j8) {
        if (!this.f47870a.contains("fire-global")) {
            this.f47870a.edit().putLong("fire-global", j8).commit();
            return true;
        }
        if (f(this.f47870a.getLong("fire-global", -1L), j8)) {
            return false;
        }
        this.f47870a.edit().putLong("fire-global", j8).commit();
        return true;
    }

    public final synchronized void k(long j8, String str) {
        String strD = d(j8);
        if (this.f47870a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            m(str, strD);
            return;
        }
        long j10 = this.f47870a.getLong("fire-count", 0L);
        if (j10 + 1 == 30) {
            a();
            j10 = this.f47870a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f47870a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f47870a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 + 1).putString("last-used-date", strD).commit();
    }

    public final synchronized void l(long j8) {
        this.f47870a.edit().putLong("fire-global", j8).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f47870a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f47870a.edit().putStringSet(str, hashSet).commit();
    }
}
