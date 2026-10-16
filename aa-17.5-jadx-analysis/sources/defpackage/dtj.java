package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class dtj {
    static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }

    public static Icon b(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        switch (iconCompat.b) {
            case -1:
                return (Icon) iconCompat.c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.c);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(iconCompat.o(), iconCompat.f);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.c);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.c);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(iconCompat.f());
                    break;
                } else {
                    if (context == null) {
                        Uri uriF = iconCompat.f();
                        Objects.toString(uriF);
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(uriF)));
                    }
                    Uri uriF2 = iconCompat.f();
                    String scheme = uriF2.getScheme();
                    InputStream inputStreamOpenInputStream = null;
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriF2);
                        } catch (Exception e) {
                            Objects.toString(uriF2);
                            Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(uriF2)), e);
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.c));
                        } catch (FileNotFoundException e2) {
                            Objects.toString(uriF2);
                            Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(uriF2)), e2);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        Uri uriF3 = iconCompat.f();
                        Objects.toString(uriF3);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(uriF3)));
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.i;
        if (mode != IconCompat.a) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static IconCompat c(Context context, Icon icon) {
        int iD = dtk.d(icon);
        if (iD == 2) {
            String strF = dtk.f(icon);
            try {
                return IconCompat.n(IconCompat.c(context, strF), strF, dtk.c(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (iD == 4) {
            return IconCompat.l(dtk.e(icon));
        }
        if (iD == 6) {
            return IconCompat.j(dtk.e(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.c = icon;
        return iconCompat;
    }

    public static IconCompat d(Object obj) {
        ebe.m(obj);
        int iD = dtk.d(obj);
        if (iD == 2) {
            return IconCompat.n(null, dtk.f(obj), dtk.c(obj));
        }
        if (iD == 4) {
            return IconCompat.l(dtk.e(obj));
        }
        if (iD == 6) {
            return IconCompat.j(dtk.e(obj));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.c = obj;
        return iconCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
        /*
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 != 0) goto Lc
            goto L47
        Lc:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = j(r7, r1)
            if (r2 != 0) goto L47
            java.lang.Class<ems> r2 = defpackage.ems.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            ems[] r1 = (defpackage.ems[]) r1
            if (r1 == 0) goto L47
            int r2 = r1.length
            if (r2 <= 0) goto L47
            r3 = r0
        L28:
            if (r3 >= r2) goto L47
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L39
            if (r5 == r7) goto L42
            goto L3b
        L39:
            if (r4 == r7) goto L42
        L3b:
            if (r7 <= r5) goto L3f
            if (r7 < r4) goto L42
        L3f:
            int r3 = r3 + 1
            goto L28
        L42:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtj.e(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007c, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c A[EDGE_INSN: B:90:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f], EDGE_INSN: B:91:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f, LOOP_LABEL: LOOP:2: B:44:0x006a->B:54:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtj.f(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void g(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean h(byte b) {
        return b > -65;
    }

    public static boolean i(byte b) {
        return b >= 0;
    }

    private static boolean j(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }
}
