package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class itl implements itk {
    private final Context a;

    public itl(Context context) {
        this.a = jfj.c(context);
    }

    @Override // defpackage.itk
    public final itd a() {
        return new ith(this.a);
    }

    @Override // defpackage.itk
    public final itf b(int i, int i2) {
        ((ype) ((ype) itj.a.f()).ai((char) 1335)).w("Trying audio capturing with L API, sampling rate: %d", i2);
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        try {
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e = e;
        }
        try {
            AudioAttributes.Builder builder2 = (AudioAttributes.Builder) builder.getClass().getMethod("setInternalCapturePreset", Integer.TYPE).invoke(builder, 8);
            builder2.getClass();
            try {
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                e = e2;
            }
            try {
                AudioAttributes.Builder builder3 = (AudioAttributes.Builder) builder2.getClass().getMethod("addTag", String.class).invoke(builder2, "fixedVolume");
                builder3.getClass();
                return gjs.i(builder3.build(), new AudioFormat.Builder().setEncoding(2).setChannelMask(12).setSampleRate(i2).build(), i);
            } catch (IllegalAccessException e3) {
                e = e3;
                ((ype) ((ype) ((ype) itj.a.g()).p(e)).ai((char) 1336)).u("addTag failed");
                return null;
            } catch (InvocationTargetException e4) {
                e = e4;
                ((ype) ((ype) ((ype) itj.a.g()).p(e)).ai((char) 1336)).u("addTag failed");
                return null;
            }
        } catch (IllegalAccessException e5) {
            e = e5;
            ((ype) ((ype) ((ype) itj.a.g()).p(e)).ai((char) 1337)).u("setInternalCapturePreset failed");
            return null;
        } catch (InvocationTargetException e6) {
            e = e6;
            ((ype) ((ype) ((ype) itj.a.g()).p(e)).ai((char) 1337)).u("setInternalCapturePreset failed");
            return null;
        }
    }

    @Override // defpackage.itk
    public final itf c(int i, int i2) {
        if (Build.VERSION.SDK_INT < 34 || !acuc.c()) {
            return new itj(new AudioRecord(8, i, 12, 2, i2));
        }
        return new itj(new AudioRecord.Builder().setContext(this.a).setAudioSource(8).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(12).build()).setBufferSizeInBytes(i2).build());
    }
}
