package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sqg {
    public static final java.lang.String a(java.util.List list, java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((java.lang.String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static final void b(java.lang.String str, java.lang.Object obj, java.util.List list) {
        list.add(str + "=" + java.lang.String.valueOf(obj));
    }

    public static defpackage.snm c(java.lang.Object obj, java.lang.String str) {
        defpackage.sqs.aB(obj, "Listener must not be null");
        defpackage.sqs.aB(str, "Listener type must not be null");
        defpackage.sqs.ay(str, "Listener type must not be empty");
        return new defpackage.snm(obj, str);
    }

    public static defpackage.sno d(java.lang.Object obj, android.os.Looper looper, java.lang.String str) {
        defpackage.sqs.aB(obj, "Listener must not be null");
        defpackage.sqs.aB(looper, "Looper must not be null");
        defpackage.sqs.aB(str, "Listener type must not be null");
        return new defpackage.sno(looper, obj, str);
    }

    public static java.lang.String e(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.SUCCESS;
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return defpackage.a.bo(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            case 23:
                return "RATE_LIMIT_EXCEEDED";
        }
    }

    public static final com.google.android.gms.common.api.ApiMetadata f(com.google.android.gms.common.api.ComplianceOptions complianceOptions, boolean z) {
        com.google.android.gms.common.api.ApiMetadata apiMetadata = new com.google.android.gms.common.api.ApiMetadata(complianceOptions, false, null);
        apiMetadata.e = z;
        return apiMetadata;
    }

    public static boolean g(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static final defpackage.rgz h(int i, int i2, int i3, int i4, int i5) {
        return new defpackage.rgz(new android.media.AudioRecord(i, i2, i3, i4, i5));
    }

    public static final defpackage.rgz i(int i, int i2) {
        defpackage.rgz.a.f().ai(8026).w("Trying audio capturing with L API, sampling rate: %d", i2);
        android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
        try {
            android.media.AudioAttributes.Builder builder2 = (android.media.AudioAttributes.Builder) builder.getClass().getMethod("setInternalCapturePreset", java.lang.Integer.TYPE).invoke(builder, 8);
            builder2.getClass();
            try {
                android.media.AudioAttributes.Builder builder3 = (android.media.AudioAttributes.Builder) builder2.getClass().getMethod("addTag", java.lang.String.class).invoke(builder2, "fixedVolume");
                builder3.getClass();
                return r(builder3.build(), new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(12).setSampleRate(i2).build(), i);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                defpackage.rgz.a.g().p(e).ai(8027).u("addTag failed");
                return null;
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
            defpackage.rgz.a.g().p(e2).ai(8028).u("setInternalCapturePreset failed");
            return null;
        }
    }

    public static final int j(com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration) {
        int i = carAudioConfiguration.a;
        return (i == 44100 || i == 48000) ? 2048 : 1024;
    }

    public static final int k(com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration) {
        int iJ = j(carAudioConfiguration);
        int i = iJ + iJ;
        int i2 = carAudioConfiguration.b;
        return (i2 == 12 || i2 == 12) ? i + i : i;
    }

    public static java.lang.String l(int i) {
        if (i == -1) {
            return "LOSS";
        }
        if (i == 1) {
            return "GAIN";
        }
        if (i == 2) {
            return "GAIN_TR";
        }
        if (i != 3) {
            return i != 4 ? defpackage.a.bo(i, "UNKNOWN:") : "GAIN_TR_EXC";
        }
        return "GAIN_TR_MAY_DUCK";
    }

    public static /* synthetic */ java.lang.String m(int i) {
        if (i == 1) {
            return "AUDIO_FORMAT_UNSPECIFIED";
        }
        if (i == 2) {
            return "AUDIO_FORMAT_48000_STEREO";
        }
        if (i != 3) {
            return i != 4 ? "null" : "AUDIO_FORMAT_48000_MONO";
        }
        return "AUDIO_FORMAT_16000_MONO";
    }

    public static java.lang.String n(int i) {
        if (i == 1) {
            return "backward";
        }
        if (i == 2) {
            return "forward";
        }
        if (i == 17) {
            return "left";
        }
        if (i == 33) {
            return "up";
        }
        if (i != 66) {
            return i != 130 ? java.lang.String.valueOf(i) : "down";
        }
        return "right";
    }

    public static /* synthetic */ java.lang.String o(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "LEGACY_GMSCORE_FAILURE";
            case 3:
                return "GEARHEAD_BINDING_FAILURE";
            case 4:
                return "GEARHEAD_BINDING_INTERRUPTED";
            case 5:
                return "GEARHEAD_CAR_SERVICE_FAILURE";
            case 6:
                return "GEARHEAD_BINDING_DIED";
            default:
                return "null";
        }
    }

    public static void p(android.content.Context context, boolean z, boolean z2, defpackage.raz razVar) {
        if (defpackage.rrx.e("ImplStager", 3)) {
            defpackage.rrx.a("ImplStager", null, "Staging impl");
        }
        new defpackage.ray(context, z, z2, razVar).start();
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01cd A[Catch: IOException -> 0x01f5, all -> 0x020b, TRY_ENTER, TryCatch #3 {IOException -> 0x01f5, blocks: (B:38:0x00bf, B:41:0x00e5, B:42:0x00ef, B:44:0x00fa, B:46:0x0102, B:47:0x0105, B:48:0x010c, B:65:0x015c, B:66:0x015f, B:68:0x0167, B:71:0x0177, B:74:0x017e, B:75:0x0189, B:76:0x018a, B:78:0x0196, B:81:0x01ba, B:82:0x01c5, B:87:0x01cd, B:88:0x01d0, B:90:0x01d2, B:91:0x01e2, B:93:0x01e4, B:94:0x01f4, B:98:0x01f8, B:99:0x01ff), top: B:112:0x00bf, outer: #5 }] */
    public static synchronized void q(java.io.File file, android.content.Context context, boolean z, boolean z2, boolean z3) throws java.io.IOException {
        java.io.File file2;
        int threadPriority;
        defpackage.sub subVar = defpackage.stg.a;
        java.io.File file3 = new java.io.File(defpackage.sub.f(file, "sdk_impl.jar"));
        try {
            try {
                try {
                    try {
                        if (file3.exists()) {
                            if (!z) {
                                try {
                                    if (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime <= file3.lastModified()) {
                                        if (defpackage.ooa.i("ImplStager")) {
                                            defpackage.rrx.a("ImplStager", null, "Reusing existing impl");
                                            return;
                                        }
                                    }
                                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                                    if (defpackage.rrx.e("ImplStager", 3)) {
                                        defpackage.rrx.d(3, "ImplStager", null, "unable to find package: %s", context.getPackageName());
                                    }
                                }
                                return;
                            }
                            if (defpackage.ooa.i("ImplStager")) {
                                defpackage.rrx.a("ImplStager", null, "Deleting old impl");
                            }
                            if (!file3.delete()) {
                                defpackage.rrx.d(4, "ImplStager", null, "Failed to delete file %s", file3.getPath());
                            }
                        }
                        java.io.File file4 = new java.io.File(defpackage.sub.f(file2, (java.lang.String) java.lang.Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", null).invoke(null, null)));
                        s(file4);
                        s(file4);
                        for (java.io.File file5 : file4.listFiles()) {
                            if (!file5.delete()) {
                                throw new java.io.IOException("Failed to delete file");
                            }
                        }
                        if (z3) {
                            try {
                                threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
                                try {
                                    android.os.Process.setThreadPriority(10);
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    if (z3) {
                                        android.os.Process.setThreadPriority(threadPriority);
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                threadPriority = 0;
                                if (z3) {
                                    android.os.Process.setThreadPriority(threadPriority);
                                }
                                throw th;
                            }
                        } else {
                            threadPriority = 0;
                        }
                        defpackage.sub subVar2 = defpackage.stg.a;
                        java.io.File file6 = new java.io.File(defpackage.sub.f(file, "sdk_impl.jar"));
                        if (android.os.Build.VERSION.SDK_INT >= 34 && !file6.setReadOnly()) {
                            defpackage.rrx.d(5, "ImplStager", null, "Failed to make %s read-only", file6);
                        }
                        new dalvik.system.DexClassLoader(file6.getAbsolutePath(), file4.getAbsolutePath(), null, java.lang.ClassLoader.getSystemClassLoader());
                        if (z3) {
                            android.os.Process.setThreadPriority(threadPriority);
                        }
                        for (java.io.File file7 : file4.listFiles()) {
                            if (file7.getName().startsWith("sdk_impl")) {
                                if (z2 && !file7.setReadable(true, false)) {
                                    throw new java.io.IOException(defpackage.a.bX(file7, "Failed to make optimized file readable "));
                                }
                                if (!file7.getName().endsWith(".dex")) {
                                    break;
                                }
                                java.lang.String absolutePath = file7.getAbsolutePath();
                                java.lang.String strSubstring = absolutePath.substring(0, absolutePath.length() - 4);
                                defpackage.sub subVar3 = defpackage.stg.a;
                                java.lang.String strBJ = defpackage.a.bJ(strSubstring, ".odex");
                                int i = defpackage.stj.a;
                                if (!file7.renameTo(new java.io.File(strBJ))) {
                                    throw new java.io.IOException(defpackage.a.bX(file7, "Failed to rename file "));
                                }
                                break;
                            }
                        }
                        return;
                    } catch (java.lang.Throwable th3) {
                        defpackage.rrx.d(5, "ImplStager", th3, "Failed to call dalvik.system.VMRuntime#getCurrentInstructionSet", new java.lang.Object[0]);
                        throw new java.lang.NoSuchMethodException("dalvik.system.VMRuntime#getCurrentInstructionSet could not be found.");
                    }
                } catch (java.lang.Throwable th4) {
                    defpackage.rrx.d(5, "ImplStager", th4, "dalvik.system.VMRuntime#getCurrentInstructionSet is unsupported.", new java.lang.Object[0]);
                    throw new java.lang.NoSuchMethodException("dalvik.system.VMRuntime#getCurrentInstructionSet could not be found.");
                }
                defpackage.sub subVar4 = defpackage.stg.a;
                file2 = new java.io.File(defpackage.sub.f(file, "oat"));
                s(file2);
                defpackage.sub subVar5 = defpackage.stg.a;
            } catch (java.io.IOException e) {
                defpackage.rrx.d(5, "ImplStager", e, "Failure dexing", new java.lang.Object[0]);
                return;
            }
        } catch (java.lang.NoSuchMethodException e2) {
            throw new java.io.IOException("Failed to get optimized dir", e2);
        }
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(context.getAssets().open("sdk_impl.jar"));
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file3));
        byte[] bArr = new byte[4096];
        while (true) {
            int i2 = bufferedInputStream.read(bArr, 0, 4096);
            if (i2 <= 0) {
                break;
            } else {
                bufferedOutputStream.write(bArr, 0, i2);
            }
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        if (z2 && !file3.setReadable(true, false)) {
            throw new java.io.IOException("Failed to make file readable");
        }
    }

    private static defpackage.rgz r(android.media.AudioAttributes audioAttributes, android.media.AudioFormat audioFormat, int i) {
        try {
            try {
                java.lang.Class cls = java.lang.Integer.TYPE;
                java.lang.reflect.Constructor constructor = android.media.AudioRecord.class.getConstructor(android.media.AudioAttributes.class, android.media.AudioFormat.class, cls, cls);
                constructor.setAccessible(true);
                return new defpackage.rgz((android.media.AudioRecord) constructor.newInstance(audioAttributes, audioFormat, java.lang.Integer.valueOf(i), 0));
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                e = e;
                defpackage.rgz.a.g().p(e).ai(8025).u("AudioRecord construction failed");
                return null;
            }
        } catch (java.lang.IllegalAccessException e2) {
            e = e2;
            defpackage.rgz.a.g().p(e).ai(8025).u("AudioRecord construction failed");
            return null;
        } catch (java.lang.InstantiationException e3) {
            e = e3;
            defpackage.rgz.a.g().p(e).ai(8025).u("AudioRecord construction failed");
            return null;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            e = e4;
            defpackage.rgz.a.g().p(e).ai(8025).u("AudioRecord construction failed");
            return null;
        }
    }

    private static void s(java.io.File file) throws java.io.IOException {
        if (!file.exists() && !file.mkdir()) {
            throw new java.io.IOException("Failed to create dir ".concat(file.toString()));
        }
        if (!file.setExecutable(true, false)) {
            throw new java.io.IOException("Failed to make directory executable ".concat(file.toString()));
        }
        if (!file.getParentFile().setExecutable(true, false)) {
            throw new java.io.IOException("Failed to make parent directory executable ".concat(file.toString()));
        }
    }
}
