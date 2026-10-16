package androidx.work.impl.model;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.NetworkRequest28;
import androidx.work.impl.utils.NetworkRequestCompat;
import androidx.work.impl.utils.NetworkRequestCompatKt;
import h.g.b.x;
import h.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkTypeConverters {
    public static final WorkTypeConverters INSTANCE = new WorkTypeConverters();

    /* compiled from: WazeSource */
    final class BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final BackoffPolicyIds INSTANCE = new BackoffPolicyIds();
        public static final int LINEAR = 1;

        private BackoffPolicyIds() {
        }
    }

    /* compiled from: WazeSource */
    final class NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final NetworkTypeIds INSTANCE = new NetworkTypeIds();
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;

        private NetworkTypeIds() {
        }
    }

    /* compiled from: WazeSource */
    final class OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final OutOfPolicyIds INSTANCE = new OutOfPolicyIds();
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;

        private OutOfPolicyIds() {
        }
    }

    /* compiled from: WazeSource */
    public final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final StateIds INSTANCE = new StateIds();
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        private StateIds() {
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private WorkTypeConverters() {
    }

    public static final int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        x.f(backoffPolicy, "backoffPolicy");
        WorkInfo.State state = WorkInfo.State.ENQUEUED;
        BackoffPolicy backoffPolicy2 = BackoffPolicy.EXPONENTIAL;
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int iOrdinal = backoffPolicy.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new i();
    }

    public static final Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers(byte[] bArr) throws IOException {
        x.f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream = byteArrayInputStream;
        try {
            ByteArrayInputStream byteArrayInputStream2 = objectInputStream;
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            try {
                ObjectInputStream objectInputStream2 = objectInputStream;
                int i2 = objectInputStream2.readInt();
                for (int i3 = 0; i3 < i2; i3++) {
                    Uri uri = Uri.parse(objectInputStream2.readUTF());
                    boolean z = objectInputStream2.readBoolean();
                    x.c(uri);
                    linkedHashSet.add(new Constraints.ContentUriTrigger(uri, z));
                }
                h.a.i.aW(objectInputStream, null);
                h.a.i.aW(objectInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final byte[] fromNetworkRequest$work_runtime(NetworkRequestCompat networkRequestCompat) throws IOException {
        x.f(networkRequestCompat, "requestCompat");
        NetworkRequest networkRequest = networkRequestCompat.getNetworkRequest();
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = byteArrayOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(objectOutputStream);
            try {
                ObjectOutputStream objectOutputStream2 = objectOutputStream;
                int[] transportTypesCompat = NetworkRequestCompatKt.getTransportTypesCompat(networkRequest);
                int[] capabilitiesCompat = NetworkRequestCompatKt.getCapabilitiesCompat(networkRequest);
                objectOutputStream2.writeInt(transportTypesCompat.length);
                for (int i2 : transportTypesCompat) {
                    objectOutputStream2.writeInt(i2);
                }
                objectOutputStream2.writeInt(capabilitiesCompat.length);
                for (int i3 : capabilitiesCompat) {
                    objectOutputStream2.writeInt(i3);
                }
                h.a.i.aW(objectOutputStream, null);
                h.a.i.aW(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                x.e(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final BackoffPolicy intToBackoffPolicy(int i2) {
        if (i2 == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i2 == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to BackoffPolicy");
    }

    public static final NetworkType intToNetworkType(int i2) {
        if (i2 == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return NetworkType.CONNECTED;
        }
        if (i2 == 2) {
            return NetworkType.UNMETERED;
        }
        if (i2 == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i2 == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to NetworkType");
    }

    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int i2) {
        if (i2 == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i2 == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to OutOfQuotaPolicy");
    }

    public static final WorkInfo.State intToState(int i2) {
        if (i2 == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i2 == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (i2 == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i2 == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i2 == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i2 == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to State");
    }

    public static final int networkTypeToInt(NetworkType networkType) {
        x.f(networkType, "networkType");
        WorkInfo.State state = WorkInfo.State.ENQUEUED;
        BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
        NetworkType networkType2 = NetworkType.NOT_REQUIRED;
        OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int iOrdinal = networkType.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                i2 = 3;
                if (iOrdinal != 3) {
                    i2 = 4;
                    if (iOrdinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                    }
                }
            }
        }
        return i2;
    }

    public static final int outOfQuotaPolicyToInt(OutOfQuotaPolicy outOfQuotaPolicy) {
        x.f(outOfQuotaPolicy, "policy");
        WorkInfo.State state = WorkInfo.State.ENQUEUED;
        BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        OutOfQuotaPolicy outOfQuotaPolicy2 = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int iOrdinal = outOfQuotaPolicy.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new i();
    }

    public static final byte[] setOfTriggersToByteArray(Set<Constraints.ContentUriTrigger> set) throws IOException {
        x.f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = objectOutputStream;
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                ObjectOutputStream objectOutputStream2 = objectOutputStream;
                objectOutputStream2.writeInt(set.size());
                for (Constraints.ContentUriTrigger contentUriTrigger : set) {
                    objectOutputStream2.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream2.writeBoolean(contentUriTrigger.isTriggeredForDescendants());
                }
                h.a.i.aW(objectOutputStream, null);
                h.a.i.aW(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                x.e(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int stateToInt(WorkInfo.State state) {
        x.f(state, "state");
        WorkInfo.State state2 = WorkInfo.State.ENQUEUED;
        BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                i2 = 3;
                if (iOrdinal != 3) {
                    i2 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new i();
                    }
                }
            }
        }
        return i2;
    }

    public static final NetworkRequestCompat toNetworkRequest$work_runtime(byte[] bArr) throws IOException {
        x.f(bArr, "bytes");
        if (bArr.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ObjectInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byteArrayInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                ObjectInputStream objectInputStream = byteArrayInputStream;
                int i2 = objectInputStream.readInt();
                int[] iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = objectInputStream.readInt();
                }
                int i4 = objectInputStream.readInt();
                int[] iArr2 = new int[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    iArr2[i5] = objectInputStream.readInt();
                }
                NetworkRequestCompat networkRequestCompatCreateNetworkRequestCompat$work_runtime = NetworkRequest28.INSTANCE.createNetworkRequestCompat$work_runtime(iArr2, iArr);
                h.a.i.aW(byteArrayInputStream, null);
                h.a.i.aW(byteArrayInputStream, null);
                return networkRequestCompatCreateNetworkRequestCompat$work_runtime;
            } finally {
            }
        } finally {
        }
    }
}
