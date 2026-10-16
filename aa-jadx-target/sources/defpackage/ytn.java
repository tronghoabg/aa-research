package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ytn {
    private ytn() {
    }

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        java.lang.System.err.println(defpackage.ytn.class.toString() + ": " + java.lang.String.format(str, objArr));
    }

    public static char[] b(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    public static boolean c(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return comparable2.compareTo(comparable) > 0;
    }

    public static boolean d(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return comparable2.compareTo(comparable) < 0;
    }

    public static boolean e(java.util.Comparator comparator, java.lang.Iterable iterable) {
        java.util.Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof java.util.SortedSet) {
            comparator2 = ((java.util.SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = defpackage.ymn.a;
            }
        } else {
            if (!(iterable instanceof defpackage.ynw)) {
                return false;
            }
            comparator2 = ((defpackage.ynw) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static void f(defpackage.ylx ylxVar, java.io.ObjectInputStream objectInputStream, int i) throws java.io.IOException, java.lang.ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            java.util.Collection collectionC = ylxVar.c(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collectionC.add(objectInputStream.readObject());
            }
        }
    }

    public static void g(defpackage.ylx ylxVar, java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(ylxVar.w().size());
        for (java.util.Map.Entry entry : ylxVar.w().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((java.util.Collection) entry.getValue()).size());
            java.util.Iterator it = ((java.util.Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static java.util.Iterator h(ymh ymhVar) {
        return new ymm(ymhVar, ymhVar.l().iterator());
    }

    public static void i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.util.List list) {
        list.add(yik.o(obj, obj2, obj3));
    }

    public static java.util.Collection j(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
        }
        return arrayList;
    }

    public static int k(long j, int i) {
        long j2 = i;
        long j3 = j % j2;
        if (j3 == 0) {
            j3 = 0;
        } else if ((((j ^ j2) >> 63) | 1) <= 0) {
            j3 += j2;
        }
        return (int) j3;
    }

    public static long l(long j, long j2, java.math.RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (zdp.a[roundingMode.ordinal()]) {
            case 1:
                defpackage.ysr.cV(false);
                return j3;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return j3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (i >= 0) {
                    return j3;
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (i <= 0) {
                    return j3;
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                long jAbs = java.lang.Math.abs(j4);
                long jAbs2 = jAbs - (java.lang.Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != java.math.RoundingMode.HALF_UP && (roundingMode != java.math.RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
            default:
                throw new java.lang.AssertionError();
        }
        return j3 + ((long) i);
    }

    public static long m(long j, long j2) {
        boolean z = (j ^ j2) < 0;
        long j3 = j2 + j;
        return z | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static boolean n(double d) {
        return java.lang.Math.getExponent(d) <= 1023;
    }

    public static defpackage.abor o(java.lang.Throwable th, boolean z) {
        java.lang.StackTraceElement[] stackTrace;
        defpackage.abor aborVarN = zdg.a.n();
        defpackage.abor aborVarN2 = zde.a.n();
        java.lang.String name = th.getClass().getName();
        aborVarN2.t();
        zde zdeVar = aborVarN2.b;
        name.getClass();
        zdeVar.b |= 1;
        zdeVar.c = name;
        if (th.getMessage() != null) {
            java.lang.String message = th.getMessage();
            aborVarN2.t();
            zde zdeVar2 = aborVarN2.b;
            message.getClass();
            zdeVar2.b |= 2;
            zdeVar2.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (java.lang.NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                defpackage.abor aborVarN3 = zdd.a.n();
                if (stackTraceElement != null) {
                    java.lang.String className = stackTraceElement.getClassName();
                    aborVarN3.t();
                    zdd zddVar = aborVarN3.b;
                    className.getClass();
                    zddVar.b |= 1;
                    zddVar.c = className;
                    java.lang.String methodName = stackTraceElement.getMethodName();
                    aborVarN3.t();
                    zdd zddVar2 = aborVarN3.b;
                    methodName.getClass();
                    zddVar2.b |= 2;
                    zddVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    aborVarN3.t();
                    zdd zddVar3 = aborVarN3.b;
                    zddVar3.b |= 8;
                    zddVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        java.lang.String fileName = stackTraceElement.getFileName();
                        aborVarN3.t();
                        zdd zddVar4 = aborVarN3.b;
                        fileName.getClass();
                        zddVar4.b |= 4;
                        zddVar4.e = fileName;
                    }
                }
                aborVarN2.t();
                zde zdeVar3 = aborVarN2.b;
                zdd zddVarN = aborVarN3.q();
                zddVarN.getClass();
                defpackage.abpj abpjVar = zdeVar3.f;
                if (!abpjVar.c()) {
                    zdeVar3.f = defpackage.abox.I(abpjVar);
                }
                zdeVar3.f.add(zddVarN);
            }
        }
        aborVarN.t();
        zdg zdgVar = aborVarN.b;
        zde zdeVarN = aborVarN2.q();
        zdeVarN.getClass();
        zdgVar.c = zdeVarN;
        zdgVar.b |= 1;
        return aborVarN;
    }

    public static /* synthetic */ java.lang.String p(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "DEFAULT";
        }
        if (i == 3) {
            return "WATCH";
        }
        if (i != 4) {
            return i != 5 ? "NONE" : "CAR";
        }
        return "UNTETHERED_HEADSET";
    }

    public static /* synthetic */ java.lang.String q(int i) {
        if (i == 1) {
            return "UNKNOWN_STATE";
        }
        if (i == 2) {
            return "IDLE";
        }
        if (i == 3) {
            return "STARTING";
        }
        if (i == 1001) {
            return "WIFI_INCOMPATIBLE_STAGE";
        }
        switch (i) {
            case 102:
                return "BT_SETUP";
            case 103:
                return "AWAITING_START";
            case 104:
                return "WIFI_SETUP";
            case 105:
                return "LAUNCHING_PROJECTION";
            case 106:
                return "PROJECTING";
            case 107:
                return "SHUTDOWN";
            default:
                return "null";
        }
    }

    public static int r(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 1000) {
            return 1001;
        }
        switch (i) {
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            default:
                return 0;
        }
    }

    public static /* synthetic */ java.lang.String s(int i) {
        if (i == 1) {
            return "UNKNOWN_ASSISTANT_SESSION_EVENT";
        }
        if (i == 2) {
            return "GEARHEAD_INTERNAL_ERROR";
        }
        if (i == 41) {
            return "GEARHEAD_TO_ASSISTANT_START_VOICE_SESSION";
        }
        if (i == 42) {
            return "GEARHEAD_TO_ASSISTANT_STOP_VOICE_SESSION";
        }
        if (i == 101) {
            return "ASSISTANT_SESSION_FUSION";
        }
        if (i == 102) {
            return "ASSISTANT_SESSION_NON_FUSION";
        }
        switch (i) {
            case 11:
                return "ASSISTANT_TO_GEARHEAD_START_VOICE_SESSION";
            case 12:
                return "ASSISTANT_TO_GEARHEAD_END_VOICE_SESSION";
            case 13:
                return "ASSISTANT_TO_GEARHEAD_END_VOICE_SESSION_FOCUS_LOST";
            case 14:
                return "ASSISTANT_TO_GEARHEAD_PROCESS_RESULT";
            case 15:
                return "ASSISTANT_TO_GEARHEAD_PROCESS_RESULT_ERROR";
            case 16:
                return "ASSISTANT_TO_GEARHEAD_VOICE_PLATE_SET_SPEECH_LEVEL";
            case 17:
                return "ASSISTANT_TO_GEARHEAD_VOICE_PLATE_SET_STATE";
            case 18:
                return "ASSISTANT_TO_GEARHEAD_VOICE_PLATE_SET_PROVIDER_INFO";
            case 19:
                return "ASSISTANT_TO_GEARHEAD_VOICE_PLATE_SET_MESSAGE";
            case 20:
                return "ASSISTANT_TO_GEARHEAD_ACTION_PLATE_SET_TEMPLATE";
            case 21:
                return "ASSISTANT_TO_GEARHEAD_ACTION_PLATE_SET_COMPONENT";
            case 22:
                return "ASSISTANT_TO_GEARHEAD_ACTION_PLATE_NOTIFY_COMPONENT_SELECTED";
            case 23:
                return "ASSISTANT_TO_GEARHEAD_OPEN_MICROPHONE";
            default:
                switch (i) {
                    case 201:
                        return "VOICE_SESSION_RESTART_REQUESTED";
                    case 202:
                        return "VOICE_SESSION_RESTART_PERFORMED";
                    case 203:
                        return "VOICE_SESSION_END_REQUESTED";
                    case 204:
                        return "VOICE_SESSION_END_PERFORMED";
                    case 205:
                        return "VOICE_SESSION_UNNECESSARY_POST";
                    case 206:
                        return "VOICE_SESSION_MISSING_POST";
                    default:
                        switch (i) {
                            case 301:
                                return "AUDIO_RECORDER_T_START";
                            case 302:
                                return "AUDIO_RECORDER_T_NO_PERMISSION";
                            case 303:
                                return "AUDIO_RECORDER_T_MIC_NO_MORE_DATA";
                            case 304:
                                return "AUDIO_RECORDER_T_CANCELLED";
                            case 305:
                                return "AUDIO_RECORDER_T_DONE";
                            case 306:
                                return "AUDIO_RECORDER_T_OTHER_ERROR";
                            case 307:
                                return "AUDIO_RECORDER_T_CLOSING_RESOURCES_STARTED";
                            case 308:
                                return "AUDIO_RECORDER_T_CLOSING_OUTPUT_FAILED";
                            case 309:
                                return "AUDIO_RECORDER_T_CLOSING_OUTPUT_FINISHED";
                            case 310:
                                return "AUDIO_RECORDER_T_CLOSING_RECORD_NULL";
                            case 311:
                                return "AUDIO_RECORDER_T_CLOSING_RECORD_EXCEPTION";
                            case 312:
                                return "AUDIO_RECORDER_T_CLOSING_RESOURCES_FINISHED";
                            case 313:
                                return "AUDIO_RECORDER_T_CLOSED_WITHOUT_STOP";
                            case 314:
                                return "AUDIO_RECORDER_T_CAR_NOT_CONNECTED_EXCEPTION";
                            case 315:
                                return "AUDIO_RECORDER_T_HANDLER_EXCEPTION";
                            case 316:
                                return "AUDIO_RECORDER_T_PREVIOUS_OUTPUT_STREAM_ACTIVE";
                            case 317:
                                return "AUDIO_RECORDER_T_INVALID_READ_OUTPUT_STREAM_CLOSED";
                            case 318:
                                return "AUDIO_RECORDER_T_UNEXPECTED_BYTES_READ";
                            case 319:
                                return "AUDIO_RECORDER_T_CAR_NOT_CONNECTED_EXCEPTION_ON_READ";
                            case 320:
                                return "AUDIO_RECORDER_T_BYTES_SENT";
                            default:
                                switch (i) {
                                    case 401:
                                        return "AUDIO_RECORDER_START_NEW_RECORDING";
                                    case 402:
                                        return "AUDIO_RECORDER_START_NO_PERMISSION";
                                    case 403:
                                        return "AUDIO_RECORDER_START_ALREADY_RECORDING";
                                    case 404:
                                        return "AUDIO_RECORDER_START_COMPLETE";
                                    case 405:
                                        return "AUDIO_RECORDER_STOP_STARTED";
                                    case 406:
                                        return "AUDIO_RECORDER_STOP_NO_PERMISSION";
                                    case 407:
                                        return "AUDIO_RECORDER_STOP_COMPLETE";
                                    case 408:
                                        return "AUDIO_RECORDER_SECURITY_EXCEPTION";
                                    case 409:
                                        return "AUDIO_RECORDER_STOP_ALREADY_STOPPING";
                                    case 410:
                                        return "AUDIO_RECORDER_STOP_ALREADY_STOPPED";
                                    default:
                                        return "null";
                                }
                        }
                }
        }
    }

    public static int t(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 40) {
            return 41;
        }
        if (i == 41) {
            return 42;
        }
        if (i == 100) {
            return 101;
        }
        if (i == 101) {
            return 102;
        }
        switch (i) {
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            default:
                switch (i) {
                    case 200:
                        return 201;
                    case 201:
                        return 202;
                    case 202:
                        return 203;
                    case 203:
                        return 204;
                    case 204:
                        return 205;
                    case 205:
                        return 206;
                    default:
                        switch (i) {
                            case 300:
                                return 301;
                            case 301:
                                return 302;
                            case 302:
                                return 303;
                            case 303:
                                return 304;
                            case 304:
                                return 305;
                            case 305:
                                return 306;
                            case 306:
                                return 307;
                            case 307:
                                return 308;
                            case 308:
                                return 309;
                            case 309:
                                return 310;
                            case 310:
                                return 311;
                            case 311:
                                return 312;
                            case 312:
                                return 313;
                            case 313:
                                return 314;
                            case 314:
                                return 315;
                            case 315:
                                return 316;
                            case 316:
                                return 317;
                            case 317:
                                return 318;
                            case 318:
                                return 319;
                            case 319:
                                return 320;
                            default:
                                switch (i) {
                                    case 400:
                                        return 401;
                                    case 401:
                                        return 402;
                                    case 402:
                                        return 403;
                                    case 403:
                                        return 404;
                                    case 404:
                                        return 405;
                                    case 405:
                                        return 406;
                                    case 406:
                                        return 407;
                                    case 407:
                                        return 408;
                                    case 408:
                                        return 409;
                                    case 409:
                                        return 410;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    protected ytn(byte[] bArr) {
    }
}
