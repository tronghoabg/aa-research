package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class itt implements defpackage.its {
    private final android.content.Context a;

    public itt(android.content.Context context) {
        this.a = defpackage.jfr.c(context);
    }

    @Override // defpackage.its
    public final defpackage.itl a() {
        return new defpackage.itp(this.a);
    }

    @Override // defpackage.its
    public final defpackage.itn b(int i, int i2) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.f()).ai((char) 1335)).w("Trying audio capturing with L API, sampling rate: %d", i2);
        android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
        try {
            try {
                android.media.AudioAttributes.Builder builder2 = (android.media.AudioAttributes.Builder) builder.getClass().getMethod("setInternalCapturePreset", java.lang.Integer.TYPE).invoke(builder, 8);
                builder2.getClass();
                try {
                    try {
                        android.media.AudioAttributes.Builder builder3 = (android.media.AudioAttributes.Builder) builder2.getClass().getMethod("addTag", java.lang.String.class).invoke(builder2, "fixedVolume");
                        builder3.getClass();
                        return defpackage.gjz.i(builder3.build(), new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(12).setSampleRate(i2).build(), i);
                    } catch (java.lang.IllegalAccessException e) {
                        e = e;
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.g()).p(e)).ai((char) 1336)).u("addTag failed");
                        return null;
                    } catch (java.lang.reflect.InvocationTargetException e2) {
                        e = e2;
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.g()).p(e)).ai((char) 1336)).u("addTag failed");
                        return null;
                    }
                } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e3) {
                    e = e3;
                }
            } catch (java.lang.IllegalAccessException e4) {
                e = e4;
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.g()).p(e)).ai((char) 1337)).u("setInternalCapturePreset failed");
                return null;
            } catch (java.lang.reflect.InvocationTargetException e5) {
                e = e5;
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.g()).p(e)).ai((char) 1337)).u("setInternalCapturePreset failed");
                return null;
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e6) {
            e = e6;
        }
    }

    @Override // defpackage.its
    public final defpackage.itn c(int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT < 34 || !defpackage.acve.c()) {
            return new defpackage.itr(new android.media.AudioRecord(8, i, 12, 2, i2));
        }
        return new defpackage.itr(a$.ExternalSyntheticApiModelOutline0.m(new android.media.AudioRecord.Builder(), this.a).setAudioSource(8).setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(12).build()).setBufferSizeInBytes(i2).build());
    }
}
