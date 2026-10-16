package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.view.Display;
import com.carstream.tech.R;
import com.carstream.tech.phone.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class ec {
    public static Boolean a;
    public static final String[] b = {".mp4", ".m4v", ".webm", ".3gp", ".mkv"};
    public static final String[] c = {".mp3", ".m4a", ".aac", ".ogg", ".wav", ".flac"};
    public static final String[] d = {".jpg", ".jpeg", ".png", ".gif", ".webp", ".bmp"};
    public static final int[] e = {16, 12, 1};
    public static boolean f;

    public static void a(MainActivity mainActivity) {
        try {
            PackageManager packageManager = mainActivity.getPackageManager();
            ComponentName componentName = new ComponentName(mainActivity.getPackageName(), "com.carstream.tech.surf.SurfCarService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return w1.o("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return w1.o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(ad.b(i2, "negative size: "));
    }

    public static long c(long j, long j2, int i) {
        long j3 = j2 & ((j >>> i) ^ j);
        return j ^ (j3 ^ (j3 << i));
    }

    public static void d(int i, int i2) {
        String strO;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strO = w1.o("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(ad.b(i2, "negative size: "));
                }
                strO = w1.o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strO);
        }
    }

    public static void e(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b(i, i2, "index"));
        }
    }

    public static void f(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? b(i, i3, "start index") : (i2 < 0 || i2 > i3) ? b(i2, i3, "end index") : w1.o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void g(MediaPlayer mediaPlayer, Context context) throws IllegalStateException, Resources.NotFoundException, IOException, SecurityException, IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd;
        try {
            assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(R.raw.voice_listening);
        } catch (Throwable unused) {
            assetFileDescriptorOpenRawResourceFd = null;
        }
        if (assetFileDescriptorOpenRawResourceFd == null) {
            File file = new File(context.getCacheDir(), "vp_2131296262.bin");
            if (!file.exists() || file.length() == 0) {
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.voice_listening);
                File file2 = new File(ad.c(file.getAbsolutePath(), ".tmp"));
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStreamOpenRawResource.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i);
                    }
                }
                fileOutputStream.close();
                inputStreamOpenRawResource.close();
                if (!file2.renameTo(file)) {
                    file = file2;
                }
            }
            mediaPlayer.setDataSource(file.getAbsolutePath());
            return;
        }
        try {
            mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
            try {
                assetFileDescriptorOpenRawResourceFd.close();
            } catch (Throwable unused2) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(com.carstream.tech.car.CarScreen r18, android.net.Uri r19, java.lang.String r20, java.util.LinkedHashMap r21, int r22) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec.h(com.carstream.tech.car.CarScreen, android.net.Uri, java.lang.String, java.util.LinkedHashMap, int):int");
    }

    public static void i(boolean[] zArr, MediaPlayer mediaPlayer, AudioManager audioManager, AudioFocusRequest audioFocusRequest, Runnable runnable, long j) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            mediaPlayer.release();
        } catch (Throwable unused) {
        }
        if (runnable == null) {
            if (audioManager == null || audioFocusRequest == null) {
                return;
            }
            try {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        if (j > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new y(audioManager, audioFocusRequest, runnable, 6, false), j);
            return;
        }
        if (audioManager != null && audioFocusRequest != null) {
            try {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            } catch (Throwable unused3) {
            }
        }
        runnable.run();
    }

    public static boolean j(Context context) {
        JSONObject jSONObjectE;
        String strO = o(context);
        if (!strO.isEmpty() && a6.f(strO) && (jSONObjectE = a6.e(strO)) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            long j = context.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getLong(xc.h("licenseMaxServerTime"), 0L);
            if ((j <= 0 || jCurrentTimeMillis >= j - 3600) && jSONObjectE.optLong("texp", 0L) >= jCurrentTimeMillis) {
                long jOptLong = jSONObjectE.optLong("kexp", 0L);
                if (jOptLong <= 0 || jOptLong >= jCurrentTimeMillis) {
                    return c5.c().equals(jSONObjectE.optString("hwid", ""));
                }
            }
        }
        return false;
    }

    public static SecretKey k() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry("cnt_tok_v1", null);
        if (entry instanceof KeyStore.SecretKeyEntry) {
            return ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder("cnt_tok_v1", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
        return keyGenerator.generateKey();
    }

    public static boolean l(Context context) {
        Display display;
        Display.Mode mode;
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null && (display = displayManager.getDisplay(0)) != null && (mode = display.getMode()) != null) {
                if (mode.getPhysicalWidth() > mode.getPhysicalHeight()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int m(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static void n(Context context, r9 r9Var, s9 s9Var, int[] iArr, int i) {
        int iRequestAudioFocus;
        MediaPlayer mediaPlayer;
        boolean[] zArr;
        if (i >= iArr.length) {
            s9Var.run();
            r9Var.run();
            return;
        }
        int i2 = iArr[i];
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(i2).setContentType(1).build();
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(3).setAudioAttributes(audioAttributesBuild).build();
        if (audioManager == null) {
            iRequestAudioFocus = 0;
        } else {
            try {
                iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
            } catch (Throwable unused) {
            }
        }
        boolean z = iRequestAudioFocus == 1;
        AudioFocusRequest audioFocusRequest = z ? audioFocusRequestBuild : null;
        if (!z && audioManager != null && audioFocusRequestBuild != null) {
            try {
                audioManager.abandonAudioFocusRequest(audioFocusRequestBuild);
            } catch (Throwable unused2) {
            }
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        boolean[] zArr2 = {false};
        boolean[] zArr3 = {false};
        Handler handler = new Handler(Looper.getMainLooper());
        sc scVar = new sc(context, r9Var, s9Var, iArr, i);
        try {
            mediaPlayer2.setAudioAttributes(audioAttributesBuild);
            g(mediaPlayer2, context);
            mediaPlayer = mediaPlayer2;
            zArr = zArr2;
            AudioFocusRequest audioFocusRequest2 = audioFocusRequest;
            try {
                tc tcVar = new tc(context, i2, zArr, mediaPlayer, audioManager, audioFocusRequest2, r9Var);
                audioManager = audioManager;
                audioFocusRequest = audioFocusRequest2;
                try {
                    mediaPlayer.setOnCompletionListener(tcVar);
                    try {
                        mediaPlayer.setOnErrorListener(new uc(zArr3, zArr, mediaPlayer, audioManager, audioFocusRequest, scVar, r9Var));
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        zArr3[0] = true;
                        int duration = mediaPlayer.getDuration();
                        long j = duration > 0 ? duration + 800 : 4000L;
                        try {
                            vc vcVar = new vc(zArr, mediaPlayer, audioManager, audioFocusRequest, r9Var);
                            zArr = zArr;
                            mediaPlayer = mediaPlayer;
                            audioFocusRequest = audioFocusRequest;
                            audioManager = audioManager;
                            handler.postDelayed(vcVar, Math.min(j, 4000L));
                        } catch (Throwable unused3) {
                            zArr = zArr;
                            mediaPlayer = mediaPlayer;
                            audioFocusRequest = audioFocusRequest;
                            audioManager = audioManager;
                            audioFocusRequest2 = audioFocusRequest;
                            i(zArr, mediaPlayer, audioManager, audioFocusRequest2, scVar, 0L);
                        }
                    } catch (Throwable unused4) {
                        zArr = zArr;
                        mediaPlayer = mediaPlayer;
                    }
                } catch (Throwable unused5) {
                }
            } catch (Throwable unused6) {
                audioManager = audioManager;
                i(zArr, mediaPlayer, audioManager, audioFocusRequest2, scVar, 0L);
            }
        } catch (Throwable unused7) {
            mediaPlayer = mediaPlayer2;
            zArr = zArr2;
        }
    }

    public static String o(Context context) {
        String strG = xc.g(context, "licenseToken", "");
        if (!f && !strG.isEmpty()) {
            f = true;
            strG.startsWith("k1:");
        }
        String strP = p(strG);
        return strP == null ? "" : strP;
    }

    public static String p(String str) {
        if (str == null || str.isEmpty() || !str.startsWith("k1:")) {
            return str;
        }
        try {
            String[] strArrSplit = str.substring(3).split(":");
            if (strArrSplit.length != 2) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, k(), new GCMParameterSpec(128, Base64.decode(strArrSplit[0], 2)));
            return new String(cipher.doFinal(Base64.decode(strArrSplit[1], 2)), "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String q(String str) {
        if (str.isEmpty()) {
            return str;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, k());
            byte[] iv = cipher.getIV();
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes("UTF-8"));
            return "k1:" + Base64.encodeToString(iv, 2) + ":" + Base64.encodeToString(bArrDoFinal, 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
