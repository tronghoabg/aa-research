package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.carstream.tech.R;
import com.carstream.tech.launcher.Ui;
import com.carstream.tech.phone.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class k1 {
    public static volatile l7 a = null;
    public static volatile r6 b = null;
    public static volatile boolean c = false;
    public static final pc[] d = {new pc("2048", "Ghép số 2048", "1 người · vuốt hoặc nút", R.drawable.game_2048), new pc("cham-nay", "Chấm nảy", "1 người · trái phải", R.drawable.game_cham_nay), new pc("co-caro", "Cờ caro", "2 người · một máy", R.drawable.game_co_caro)};
    public static final t8[] e = {new t8("pill", "Thanh ngang"), new t8("ring", "Viên thuốc"), new t8("card", "Thẻ giấy")};
    public static final e0 f = new e0();
    public static volatile l7 g = null;
    public static boolean h = true;

    public static String A(ArrayList arrayList, String str, File file) {
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= size) {
                return null;
            }
            Object obj = arrayList.get(i);
            i++;
            try {
                ZipFile zipFile2 = new ZipFile((String) obj);
                try {
                    for (String str2 : Build.SUPPORTED_ABIS) {
                        ZipEntry entry = zipFile2.getEntry("lib/" + str2 + "/" + str);
                        if (entry != null) {
                            InputStream inputStream = zipFile2.getInputStream(entry);
                            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                            }
                            fileOutputStream.close();
                            inputStream.close();
                            try {
                                file.setReadable(true, false);
                            } catch (Throwable unused) {
                            }
                            String absolutePath = file.getAbsolutePath();
                            try {
                                zipFile2.close();
                            } catch (Throwable unused2) {
                            }
                            return absolutePath;
                        }
                    }
                    try {
                        zipFile2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    zipFile = zipFile2;
                    if (zipFile != null) {
                        zipFile.close();
                    }
                }
            } catch (Throwable unused5) {
            }
        }
    }

    public static void B(View view, int i, boolean z, int i2) {
        view.setBackground(new RippleDrawable(ColorStateList.valueOf(h ? 1308619238 : 866334486), z ? c(i) : t(i, i2), null));
    }

    public static void C(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }

    public static void D(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i2 + 2;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i2 + 3;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 += 4;
        } while (i2 < 16);
    }

    public static TextView a(int i, Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(i);
        textView.setGravity(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    public static l8 b(MainActivity mainActivity, String[] strArr, Drawable[] drawableArr, int i, m8 m8Var) {
        l8 l8Var = new l8(mainActivity, d8.g(mainActivity, 8), d8.g(mainActivity, 8));
        l8Var.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 2), d8.g(mainActivity, 16), d8.g(mainActivity, 12));
        int i2 = 0;
        while (i2 < strArr.length) {
            boolean z = i2 == i;
            TextView textViewO = o(mainActivity, strArr[i2], 13, 1, z ? d8.k() : d8.o());
            textViewO.setGravity(17);
            textViewO.setPadding(d8.g(mainActivity, 14), d8.g(mainActivity, 7), d8.g(mainActivity, 14), d8.g(mainActivity, 7));
            Drawable drawable = (drawableArr == null || i2 >= drawableArr.length) ? null : drawableArr[i2];
            if (drawable != null) {
                int iG = d8.g(mainActivity, 18);
                drawable.setBounds(0, 0, iG, iG);
                textViewO.setCompoundDrawables(drawable, null, null, null);
                textViewO.setCompoundDrawablePadding(d8.g(mainActivity, 8));
                textViewO.setPadding(d8.g(mainActivity, 10), d8.g(mainActivity, 6), d8.g(mainActivity, 14), d8.g(mainActivity, 6));
            }
            B(textViewO, z ? d8.a() : d8.j(200), false, d8.g(mainActivity, Ui.R_PILL));
            textViewO.setOnClickListener(new k8(m8Var, i2, 0));
            l8Var.addView(textViewO);
            i2++;
        }
        return l8Var;
    }

    public static GradientDrawable c(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public static boolean d(bd[] bdVarArr) {
        int i;
        for (bd bdVar : bdVarArr) {
            int iH = ad.h(bdVar.a);
            if (iH != 0 && iH != 1 && iH != 2 && iH != 3 && (iH != 4 || ((i = bdVar.b) != R.drawable.ic_hd && i != R.drawable.ic_cc && i != R.drawable.ic_mini_player))) {
                return false;
            }
        }
        return true;
    }

    public static s8 e(Context context, String str, cd cdVar) {
        return (cdVar == null || cdVar.e) ? (cdVar == null || (cdVar.b != 2 && d(cdVar.c) && d(cdVar.d))) ? "ring".equals(str) ? new z1(context, 0) : "card".equals(str) ? new x2(context) : new z1(context, 1) : new z2(context) : new z2(context);
    }

    public static boolean f() {
        l7 l7Var = g;
        return l7Var != null && l7Var.d();
    }

    public static int g(Context context, float f2) {
        int iRound = Math.round(TypedValue.applyDimension(1, d8.l(context, 0.7f) * f2, context.getResources().getDisplayMetrics()));
        if (f2 <= 0.0f || iRound >= 1) {
            return iRound;
        }
        return 1;
    }

    public static void h(long[] jArr, int i, long j) {
        long jC = ec.c(ec.c(ec.c(ec.c(ec.c(j, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = jC & (-6148914691236517206L);
        jArr[i + 1] = (jC << 1) & (-6148914691236517206L);
    }

    public static void i(Context context) {
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            String strZ = z(context);
            if (externalFilesDir != null && strZ != null) {
                String str = "#!/system/bin/sh\n# CarStream tu sinh moi lan app khoi dong — dung sua tay.\ncp '" + strZ + "' /data/local/tmp/csrun && cp '" + new File(externalFilesDir, "libguard.so").getAbsolutePath() + "' /data/local/tmp/libguard.so && chmod 755 /data/local/tmp/csrun && exec /data/local/tmp/csrun \"$@\"\n";
                File file = new File(externalFilesDir, "bochieu.sh");
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                fileOutputStream.write(str.getBytes("UTF-8"));
                fileOutputStream.close();
                try {
                    file.setReadable(true, false);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    public static LinearLayout j(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, d8.g(context, 6));
        return linearLayout;
    }

    public static View k(Context context) {
        View view = new View(context);
        view.setBackgroundColor(d8.j(300));
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.max(1, d8.g(context, 1) / 2)));
        return view;
    }

    public static TextView l(MainActivity mainActivity, String str) {
        TextView textView = new TextView(mainActivity);
        textView.setText(str);
        textView.setTextSize(2, 26);
        textView.setTextColor(d8.o());
        textView.setTypeface(d8.i(mainActivity));
        textView.setIncludeFontPadding(true);
        return textView;
    }

    public static ImageView m(Context context, int i, View.OnClickListener onClickListener) {
        int iO = d8.o();
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageTintList(ColorStateList.valueOf(iO));
        int iG = g(context, 16.0f);
        imageView.setPadding(iG, iG, iG, iG);
        B(imageView, x(), true, 0);
        imageView.setOnClickListener(onClickListener);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        return imageView;
    }

    public static long n(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & (-8608480567731124088L);
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & (-8608480567731124088L);
        long j11 = (((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8);
        long j12 = (((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9);
        long j13 = (((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10);
        return (j11 & 1229782938247303441L) | (j12 & 2459565876494606882L) | (j13 & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & (-8608480567731124088L));
    }

    public static TextView o(Context context, String str, int i, int i2, int i3) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(2, i);
        textView.setTextColor(i3);
        textView.setTypeface(i2 == 1 ? d8.f(context, 1) : d8.d(0, context, "fonts/BeVietnamPro-Regular.ttf"));
        textView.setIncludeFontPadding(true);
        return textView;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long jReverse = Long.reverse(j);
        long jReverse2 = Long.reverse(j2);
        long jReverse3 = Long.reverse(j3);
        long jReverse4 = Long.reverse(j4);
        long jReverse5 = Long.reverse(n(jReverse, jReverse3));
        long jN = n(j, j3) << 1;
        long jReverse6 = Long.reverse(n(jReverse2, jReverse4));
        long jN2 = n(j2, j4);
        long j5 = jN2 << 1;
        long jReverse7 = Long.reverse(n(jReverse ^ jReverse2, jReverse3 ^ jReverse4));
        long jN3 = ((n(j ^ j2, j3 ^ j4) << 1) ^ ((jReverse6 ^ jN) ^ j5)) ^ ((jN2 << 63) ^ (jN2 << 58));
        jArr[0] = jReverse5 ^ ((jN3 >>> 7) ^ (((jN3 >>> 1) ^ jN3) ^ (jN3 >>> 2)));
        jArr[1] = ((jN3 << 57) ^ ((jN3 << 63) ^ (jN3 << 62))) ^ ((jReverse7 ^ ((jN ^ jReverse5) ^ jReverse6)) ^ (((j5 ^ (j5 >>> 1)) ^ (j5 >>> 2)) ^ (j5 >>> 7)));
    }

    public static TextView q(MainActivity mainActivity, String str, View.OnClickListener onClickListener) {
        TextView textViewO = o(mainActivity, str, 14, 1, d8.k());
        textViewO.setGravity(17);
        B(textViewO, d8.a(), false, d8.g(mainActivity, Ui.R_PILL));
        textViewO.setOnClickListener(onClickListener);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, d8.g(mainActivity, 48));
        layoutParams.topMargin = d8.g(mainActivity, 10);
        textViewO.setLayoutParams(layoutParams);
        return textViewO;
    }

    public static TextView r(Context context, String str, View.OnClickListener onClickListener) {
        TextView textViewO = o(context, str, 14, 1, d8.o());
        textViewO.setGravity(17);
        B(textViewO, d8.j(200), false, d8.g(context, Ui.R_PILL));
        textViewO.setOnClickListener(onClickListener);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, d8.g(context, 48));
        layoutParams.topMargin = d8.g(context, 10);
        textViewO.setLayoutParams(layoutParams);
        return textViewO;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r4) {
        /*
            r0 = 0
            r1 = 1
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "uimode"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L1c
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L20
            int r2 = r2.getNightMode()     // Catch: java.lang.Throwable -> L1c
            r3 = 2
            if (r2 != r3) goto L19
        L17:
            r0 = r1
            goto L31
        L19:
            if (r2 != r1) goto L20
            goto L31
        L1c:
            r2 = move-exception
            java.lang.String.valueOf(r2)
        L20:
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.uiMode
            r4 = r4 & 48
            r2 = 16
            if (r4 == r2) goto L31
            goto L17
        L31:
            defpackage.k1.h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.s(android.content.Context):void");
    }

    public static GradientDrawable t(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    public static LinearLayout u(MainActivity mainActivity, String str, int i, TextView[] textViewArr) {
        LinearLayout linearLayoutA = ad.a(mainActivity, 1);
        linearLayoutA.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 4), d8.g(mainActivity, 16), d8.g(mainActivity, 12));
        LinearLayout linearLayoutA2 = ad.a(mainActivity, 0);
        linearLayoutA2.addView(o(mainActivity, str, 12, 0, d8.p()), new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewO = o(mainActivity, i + "%", 12, 0, d8.p());
        textViewO.setTypeface(Typeface.MONOSPACE);
        linearLayoutA2.addView(textViewO);
        linearLayoutA.addView(linearLayoutA2);
        SeekBar seekBar = new SeekBar(mainActivity);
        seekBar.setMax(160);
        seekBar.setProgress(Math.max(0, Math.min(160, i - 60)));
        Drawable progressDrawable = seekBar.getProgressDrawable();
        int iA = d8.a();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        progressDrawable.setColorFilter(iA, mode);
        seekBar.getThumb().setColorFilter(d8.a(), mode);
        linearLayoutA.addView(seekBar);
        if (textViewArr.length > 0) {
            textViewArr[0] = textViewO;
        }
        return linearLayoutA;
    }

    public static TextView v(Context context, String str, int i, int i2) {
        TextView textViewO = o(context, str, 12, 1, i);
        textViewO.setPadding(d8.g(context, 14), d8.g(context, 7), d8.g(context, 14), d8.g(context, 7));
        textViewO.setBackground(t(i2, d8.g(context, Ui.R_PILL)));
        return textViewO;
    }

    public static HorizontalScrollView w(MainActivity mainActivity, View[] viewArr, String[] strArr, int i, m8 m8Var) {
        LinearLayout linearLayoutA = ad.a(mainActivity, 0);
        int i2 = 0;
        while (i2 < viewArr.length) {
            int i3 = i2 == i ? 1 : 0;
            LinearLayout linearLayoutA2 = ad.a(mainActivity, 1);
            linearLayoutA2.setOnClickListener(new k8(m8Var, i2, 1));
            FrameLayout frameLayout = new FrameLayout(mainActivity);
            frameLayout.setBackground(t(-12107208, d8.g(mainActivity, 14)));
            frameLayout.setClipToOutline(true);
            frameLayout.addView(viewArr[i2], new FrameLayout.LayoutParams(-1, -1));
            if (i3 != 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(0);
                gradientDrawable.setCornerRadius(d8.g(mainActivity, 14));
                gradientDrawable.setStroke(d8.g(mainActivity, 3), d8.a());
                frameLayout.setForeground(gradientDrawable);
            }
            linearLayoutA2.addView(frameLayout, new LinearLayout.LayoutParams(d8.g(mainActivity, 92), d8.g(mainActivity, 54)));
            TextView textViewO = o(mainActivity, strArr[i2], 11, i3, i3 != 0 ? d8.a() : d8.p());
            textViewO.setGravity(17);
            linearLayoutA2.addView(textViewO, new LinearLayout.LayoutParams(d8.g(mainActivity, 92), -2));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i2 > 0) {
                layoutParams.leftMargin = d8.g(mainActivity, 10);
            }
            linearLayoutA.addView(linearLayoutA2, layoutParams);
            i2++;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(mainActivity);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setPadding(d8.g(mainActivity, 16), 0, d8.g(mainActivity, 16), d8.g(mainActivity, 10));
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayoutA);
        return horizontalScrollView;
    }

    public static int x() {
        return d8.j(h ? 300 : 200);
    }

    public static LinearLayout y(MainActivity mainActivity, String str, String str2, boolean z, n8 n8Var) {
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 11), d8.g(mainActivity, 16), d8.g(mainActivity, 11));
        linearLayout.setMinimumHeight(d8.g(mainActivity, 48));
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(o(mainActivity, str, 15, 1, d8.o()));
        if (str2.length() > 0) {
            linearLayout2.addView(o(mainActivity, str2, 12, 0, d8.p()));
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        o8 o8Var = new o8(mainActivity, z);
        linearLayout.addView(o8Var, new LinearLayout.LayoutParams(d8.g(mainActivity, 50), d8.g(mainActivity, 29)));
        B(linearLayout, 0, false, d8.g(mainActivity, 18));
        linearLayout.setOnClickListener(new u0(o8Var, n8Var, 6));
        return linearLayout;
    }

    public static String z(Context context) {
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(applicationInfo.sourceDir);
                String[] strArr = applicationInfo.splitSourceDirs;
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                String strA = A(arrayList, "libcsstart.so", new File(externalFilesDir, "csboot.bin"));
                String strA2 = A(arrayList, "libguard.so", new File(externalFilesDir, "libguard.so"));
                if (strA != null && strA2 != null) {
                    return strA;
                }
            }
            return null;
        } catch (Throwable th) {
            String.valueOf(th);
            return null;
        }
    }
}
