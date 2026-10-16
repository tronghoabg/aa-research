package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class se {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public se(java.util.List list, java.util.List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((java.lang.Integer) list.get(i)).intValue();
            ((float[]) this.a)[i] = ((java.lang.Float) list2.get(i)).floatValue();
        }
    }

    public static final boolean e(android.text.method.KeyListener keyListener) {
        return !(keyListener instanceof android.text.method.NumberKeyListener);
    }

    public static final android.text.method.KeyListener f(android.text.method.KeyListener keyListener) {
        if (e(keyListener) && !(keyListener instanceof defpackage.end)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof android.text.method.NumberKeyListener)) {
                return new defpackage.end(keyListener);
            }
        }
        return keyListener;
    }

    public static /* synthetic */ java.util.List m(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public static final boolean o(java.lang.String str, java.lang.String str2) {
        return defpackage.dux.b(str).startsWith(defpackage.dux.b(str2) + '/');
    }

    public final void a(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = (android.content.Intent) this.b;
        intent.setData(uri);
        context.startActivity(intent, (android.os.Bundle) this.a);
    }

    public final void b() {
        ((android.util.SparseIntArray) this.b).clear();
    }

    public final void c() {
        ((android.util.SparseIntArray) this.a).clear();
    }

    public final void d(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = ((android.widget.EditText) this.b).getContext().obtainStyledAttributes(attributeSet, defpackage.ft.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            defpackage.eng engVar = (defpackage.eng) ((defpackage.se) this.a).a;
            if (engVar.a != z) {
                engVar.a = z;
                if (z) {
                    synchronized (defpackage.emx.a) {
                        defpackage.emx emxVar = defpackage.emx.b;
                        defpackage.ebl.o(false, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                    }
                    throw null;
                }
            }
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final android.view.inputmethod.InputConnection g(android.view.inputmethod.InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof defpackage.enc) ? new defpackage.enc((android.widget.TextView) ((defpackage.se) this.a).b, inputConnection) : inputConnection;
    }

    public final void h(int i, android.os.Bundle bundle, android.os.Messenger messenger) throws android.os.RemoteException {
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((android.os.Messenger) this.b).send(messageObtain);
    }

    public final void i(java.lang.Runnable runnable) {
        ((android.view.Choreographer) this.a).postFrameCallback(new defpackage.jgr(runnable, 1));
    }

    public final defpackage.aizj j() {
        return new defpackage.aizc(new defpackage.dnf(this, (defpackage.afdk) null, 2));
    }

    public final void k(android.telecom.Call.Callback callback, android.os.Handler handler) {
        ((android.telecom.Call) this.a).registerCallback(callback, handler);
    }

    public final void l(android.telecom.Call.Callback callback) {
        ((android.telecom.Call) this.a).unregisterCallback(callback);
    }

    public final java.io.File n(android.net.Uri uri) {
        java.lang.String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            java.util.Objects.toString(uri);
            throw new java.lang.IllegalArgumentException("Unable to find path from root: ".concat(java.lang.String.valueOf(uri)));
        }
        java.lang.String strDecode = android.net.Uri.decode(encodedPath.substring(1, iIndexOf));
        java.lang.String strDecode2 = android.net.Uri.decode(encodedPath.substring(iIndexOf + 1));
        java.io.File file = (java.io.File) ((java.util.HashMap) this.b).get(strDecode);
        if (file == null) {
            java.util.Objects.toString(uri);
            throw new java.lang.IllegalArgumentException("Unable to find configured root for ".concat(java.lang.String.valueOf(uri)));
        }
        java.io.File file2 = new java.io.File(file, strDecode2);
        try {
            java.io.File canonicalFile = file2.getCanonicalFile();
            if (o(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new java.lang.SecurityException("Resolved path jumped beyond configured root");
        } catch (java.io.IOException unused) {
            file2.toString();
            throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
        }
    }

    public final defpackage.dpp p() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return defpackage.dpv.a((java.lang.String) obj);
        }
        android.util.Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((java.lang.String) this.b) + ". Using WrapContent.");
        return defpackage.dpv.a("wrap");
    }

    public final boolean q() {
        return this.a == null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void r(defpackage.acku ackuVar) {
        int i = ackuVar.a;
        if (i != 0) {
            this.a.execute(new defpackage.hif((defpackage.ebl) this.b, i, 1));
        } else {
            java.lang.Object obj = ackuVar.b;
            this.a.execute(new defpackage.af(this.b, obj, 18, (short[]) null));
        }
    }

    public se(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    }

    public se(android.content.Context context, android.telecom.Call call) {
        this.b = context;
        this.a = call;
    }

    public se(android.view.animation.Animation animation) {
        this.b = animation;
        this.a = null;
    }

    public se(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public se(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public se(android.animation.Animator animator) {
        this.b = null;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.a = animatorSet;
        animatorSet.play(animator);
    }

    public se(android.os.IBinder iBinder, android.os.Bundle bundle) {
        this.b = new android.os.Messenger(iBinder);
        this.a = bundle;
    }

    public se(java.lang.String str) {
        this.b = new java.util.HashMap();
        this.a = str;
    }

    public se(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f};
    }

    public se(short[] sArr) {
        this.a = android.view.Choreographer.getInstance();
        this.b = android.os.Looper.myLooper();
    }

    public se(char[] cArr) {
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
    }

    public se(android.widget.EditText editText, byte[] bArr) {
        this.b = editText;
        defpackage.eng engVar = new defpackage.eng(editText);
        this.a = engVar;
        editText.addTextChangedListener(engVar);
        editText.setEditableFactory(defpackage.enb.a());
    }

    public se(android.widget.EditText editText) {
        this.b = editText;
        this.a = new defpackage.se(editText, (byte[]) null);
    }

    public se(byte[] bArr) {
        this.a = new android.util.SparseIntArray();
        this.b = new android.util.SparseIntArray();
    }

    public se() {
        androidx.car.app.hardware.common.CarValue<java.lang.Boolean> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_BOOLEAN;
        this.a = carValue;
        this.b = carValue;
    }
}
