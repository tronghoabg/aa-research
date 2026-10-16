package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dsy {
    public dsy() {
    }

    static int h(android.app.Notification.Action action) {
        return action.getEmphasisHint();
    }

    static int i(android.app.Notification.Action action) {
        return action.getStyleHint();
    }

    public static android.os.Bundle[] j(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof android.os.Bundle[]) || parcelableArray == null) {
            return (android.os.Bundle[]) parcelableArray;
        }
        android.os.Bundle[] bundleArr = (android.os.Bundle[]) java.util.Arrays.copyOf(parcelableArray, parcelableArray.length, android.os.Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static defpackage.dut[] k(android.os.Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        defpackage.dut[] dutVarArr = new defpackage.dut[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            android.os.Bundle bundle = bundleArr[i];
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            java.util.HashSet hashSet = new java.util.HashSet();
            if (stringArrayList != null) {
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hashSet.add(stringArrayList.get(i2));
                }
            }
            dutVarArr[i] = new defpackage.dut(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return dutVarArr;
    }

    public static android.text.Spanned l(java.lang.String str) {
        return android.text.Html.fromHtml(str, 0);
    }

    public static defpackage.zhs m(java.util.concurrent.Executor executor, defpackage.afer aferVar) {
        return defpackage.dlv.n(new defpackage.fkg(executor, aferVar, 0));
    }

    public android.view.View a(android.view.MenuItem menuItem) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public void g(defpackage.ajnd ajndVar) {
        throw null;
    }

    public final defpackage.fju n(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        str.getClass();
        try {
            java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(str).asSubclass(defpackage.fju.class);
            clsAsSubclass.getClass();
            try {
                java.lang.Object objNewInstance = clsAsSubclass.getDeclaredConstructor(android.content.Context.class, androidx.work.WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                defpackage.fju fjuVar = (defpackage.fju) objNewInstance;
                if (!fjuVar.d) {
                    return fjuVar;
                }
                throw new java.lang.IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (java.lang.Throwable th) {
                defpackage.fjv.a();
                android.util.Log.e(defpackage.fkf.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            defpackage.fjv.a();
            android.util.Log.e(defpackage.fkf.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    public dsy(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }

    public void b(android.view.SubMenu subMenu) {
    }
}
