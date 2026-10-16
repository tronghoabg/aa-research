package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.carstream.tech.box.BoxActivity;
import com.carstream.tech.car.CarScreen;
import com.google.android.gms.car.input.CarEditable;
import com.google.android.gms.car.input.InputManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class z implements ub, InputManager {
    public Object a;
    public Object b;

    public z(int i) {
        switch (i) {
            case 4:
                this.a = new Handler(Looper.getMainLooper());
                this.b = new AtomicInteger();
                break;
            default:
                this.a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
                byte[] bArr = new byte[128];
                this.b = bArr;
                int i2 = 0;
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = -1;
                }
                while (true) {
                    byte[] bArr2 = (byte[]) this.a;
                    if (i2 >= bArr2.length) {
                        bArr[65] = bArr[97];
                        bArr[66] = bArr[98];
                        bArr[67] = bArr[99];
                        bArr[68] = bArr[100];
                        bArr[69] = bArr[101];
                        bArr[70] = bArr[102];
                        break;
                    } else {
                        bArr[bArr2[i2]] = (byte) i2;
                        i2++;
                    }
                }
        }
    }

    public static String b(HttpURLConnection httpURLConnection) {
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            return "UTF-8";
        }
        for (String str : contentType.split(";")) {
            String strTrim = str.trim();
            if (strTrim.toLowerCase().startsWith("charset=")) {
                String strReplace = strTrim.substring(8).trim().replace("\"", "");
                try {
                    if (Charset.isSupported(strReplace)) {
                        return strReplace;
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return "UTF-8";
    }

    public static ArrayList e(String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() >= 2) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(1);
                for (int i = 0; i < jSONArray2.length() && arrayList.size() < 6; i++) {
                    String strTrim = jSONArray2.optString(i, "").trim();
                    if (!strTrim.isEmpty()) {
                        arrayList.add(strTrim);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // defpackage.ub
    public void a(Bitmap bitmap) {
        ImageView imageView;
        CarScreen carScreen = (CarScreen) this.b;
        if (bitmap == null || !carScreen.homeShowing || !((String) this.a).equals(z6.x()) || (imageView = carScreen.home.g) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public byte[] c(int i, String str) throws IOException {
        byte[] bArr = (byte[]) this.b;
        if (i < 0 || str.length() - i < 0) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i2 = i >>> 1;
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            byte b = bArr[str.charAt(i3)];
            i3 += 2;
            int i6 = bArr[str.charAt(i5)] | (b << 4);
            if (i6 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr2[i4] = (byte) i6;
        }
        return bArr2;
    }

    public void d(byte[] bArr) {
        long[] jArr = ((long[][]) this.b)[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = ((long[][]) this.b)[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        w1.q(j, bArr, 0);
        w1.q(j2, bArr, 8);
    }

    @Override // com.google.android.gms.car.input.InputManager
    public boolean isCurrentCarEditable(CarEditable carEditable) {
        CarEditable carEditable2 = (CarEditable) this.b;
        return carEditable2 != null && carEditable2 == carEditable;
    }

    @Override // com.google.android.gms.car.input.InputManager
    public boolean isInputActive() {
        return ((CarEditable) this.b) != null;
    }

    @Override // com.google.android.gms.car.input.InputManager
    public boolean isValid() {
        return ((InputMethodManager) ((BoxActivity) this.a).getSystemService("input_method")) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.car.input.InputManager
    public void startInput(CarEditable carEditable) {
        View view = carEditable instanceof View ? (View) carEditable : null;
        InputMethodManager inputMethodManager = (InputMethodManager) ((BoxActivity) this.a).getSystemService("input_method");
        if (view == null || inputMethodManager == null) {
            return;
        }
        this.b = carEditable;
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.post(new h(inputMethodManager, view, 4, false));
    }

    @Override // com.google.android.gms.car.input.InputManager
    public void stopInput() {
        Object obj = (CarEditable) this.b;
        View view = obj instanceof View ? (View) obj : null;
        this.b = null;
        InputMethodManager inputMethodManager = (InputMethodManager) ((BoxActivity) this.a).getSystemService("input_method");
        if (view == null || inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        view.clearFocus();
    }

    public /* synthetic */ z(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public z(PrivateKey privateKey, Certificate certificate) {
        this.a = privateKey;
        this.b = certificate;
    }
}
