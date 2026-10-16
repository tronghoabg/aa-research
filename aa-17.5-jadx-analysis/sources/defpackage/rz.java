package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.telecom.Call;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.animation.Animation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.car.app.hardware.common.CarValue;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class rz {
    public final Object a;
    public final Object b;

    public rz(List list, List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.a)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public static final boolean e(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static final KeyListener f(KeyListener keyListener) {
        if (e(keyListener) && !(keyListener instanceof emx)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new emx(keyListener);
            }
        }
        return keyListener;
    }

    public static /* synthetic */ List m(Object[] objArr) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static final boolean o(String str, String str2) {
        return duq.b(str).startsWith(duq.b(str2) + '/');
    }

    public final void a(Context context, Uri uri) {
        Intent intent = (Intent) this.b;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.a);
    }

    public final void b() {
        ((SparseIntArray) this.b).clear();
    }

    public final void c() {
        ((SparseIntArray) this.a).clear();
    }

    public final void d(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, fs.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ena enaVar = (ena) ((rz) this.a).a;
            if (enaVar.a != z) {
                enaVar.a = z;
                if (z) {
                    synchronized (emr.a) {
                        emr emrVar = emr.b;
                        ebe.k(false, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                    }
                    throw null;
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection g(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof emw) ? new emw((TextView) ((rz) this.a).b, inputConnection) : inputConnection;
    }

    public final void h(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.b).send(messageObtain);
    }

    public final void i(Runnable runnable) {
        ((Choreographer) this.a).postFrameCallback(new jgj(runnable, 1));
    }

    public final aiyk j() {
        return new aiyd(new dmx(this, (afck) null, 2));
    }

    public final void k(Call.Callback callback, Handler handler) {
        ((Call) this.a).registerCallback(callback, handler);
    }

    public final void l(Call.Callback callback) {
        ((Call) this.a).unregisterCallback(callback);
    }

    public final File n(Uri uri) throws IOException {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            Objects.toString(uri);
            throw new IllegalArgumentException("Unable to find path from root: ".concat(String.valueOf(uri)));
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) ((HashMap) this.b).get(strDecode);
        if (file == null) {
            Objects.toString(uri);
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (o(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            file2.toString();
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
        }
    }

    public final dph p() {
        Object obj = this.a;
        if (obj != null) {
            return dpn.a((String) obj);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.b) + ". Using WrapContent.");
        return dpn.a("wrap");
    }

    public final boolean q() {
        return this.a == null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void r(acjs acjsVar) {
        int i = acjsVar.a;
        if (i != 0) {
            this.a.execute(new hhx((dsg) this.b, i, 1));
        } else {
            Object obj = acjsVar.b;
            this.a.execute(new af(this.b, obj, 18, (short[]) null));
        }
    }

    public rz(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    }

    public rz(Context context, Call call) {
        this.b = context;
        this.a = call;
    }

    public rz(Animation animation) {
        this.b = animation;
        this.a = null;
    }

    public rz(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public rz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public rz(Animator animator) {
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.a = animatorSet;
        animatorSet.play(animator);
    }

    public rz(IBinder iBinder, Bundle bundle) {
        this.b = new Messenger(iBinder);
        this.a = bundle;
    }

    public rz(String str) {
        this.b = new HashMap();
        this.a = str;
    }

    public rz(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
    }

    public rz(short[] sArr) {
        this.a = Choreographer.getInstance();
        this.b = Looper.myLooper();
    }

    public rz(char[] cArr) {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public rz(EditText editText, byte[] bArr) {
        this.b = editText;
        ena enaVar = new ena(editText);
        this.a = enaVar;
        editText.addTextChangedListener(enaVar);
        editText.setEditableFactory(emv.a());
    }

    public rz(EditText editText) {
        this.b = editText;
        this.a = new rz(editText, (byte[]) null);
    }

    public rz(byte[] bArr) {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public rz() {
        CarValue<Boolean> carValue = CarValue.UNKNOWN_BOOLEAN;
        this.a = carValue;
        this.b = carValue;
    }
}
