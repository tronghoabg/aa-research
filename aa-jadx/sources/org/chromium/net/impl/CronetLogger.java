package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CronetLogger {

    public enum CronetAdaptiveTrafficRequestState {
        CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_UNKNOWN,
        CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_NOT_STARTED,
        CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_STARTED,
        CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_SUCCEEDED,
        CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_FAILED,
        CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_CANCELLED
    }

    public static final class CronetAdaptiveTrafficTerminatedInfo {
        public CronetAdaptiveTrafficTerminatedInfo(org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
            org.chromium.net.impl.CronetLogger.CronetAdaptiveTrafficRequestState cronetAdaptiveTrafficRequestState = org.chromium.net.impl.CronetLogger.CronetAdaptiveTrafficRequestState.CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_UNKNOWN;
            new java.util.concurrent.atomic.AtomicReference(cronetAdaptiveTrafficRequestState);
            new java.util.concurrent.atomic.AtomicReference(cronetAdaptiveTrafficRequestState);
            new java.util.concurrent.atomic.AtomicReference(org.chromium.net.impl.CronetLogger.CronetAdaptiveTrafficWinner.CRONET_ADAPTIVE_TRAFFIC_WINNER_UNKNOWN);
        }
    }

    public enum CronetAdaptiveTrafficWinner {
        CRONET_ADAPTIVE_TRAFFIC_WINNER_UNKNOWN,
        CRONET_ADAPTIVE_TRAFFIC_WINNER_MAIN,
        CRONET_ADAPTIVE_TRAFFIC_WINNER_FALLBACK
    }

    public static class CronetEngineBuilderInfo {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final java.lang.String f;
        public final boolean g;
        public final int h;
        public final long i;

        public CronetEngineBuilderInfo(boolean z, java.lang.String str, java.lang.String str2, boolean z2, boolean z3, boolean z4, int i, java.lang.String str3, boolean z5, int i2, long j) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = i;
            this.f = str3;
            this.g = z5;
            this.h = i2;
            this.i = j;
        }
    }

    public static final class CronetEngineBuilderInitializedInfo {
        public long a;
        public org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo.Author b;
        public int c = -1;
        public org.chromium.net.impl.CronetLogger.CronetSource d = org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED;
        public java.lang.Boolean e;
        public org.chromium.net.impl.CronetLogger.CronetVersion f;
        public org.chromium.net.impl.CronetLogger.CronetVersion g;
        public int h;

        public enum Author {
            API,
            IMPL
        }
    }

    public static final class CronetInitializedInfo {
        public CronetInitializedInfo() {
            org.chromium.net.impl.CronetLogger.CronetSource cronetSource = org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED;
        }
    }

    public enum CronetSource {
        CRONET_SOURCE_UNSPECIFIED,
        CRONET_SOURCE_STATICALLY_LINKED,
        CRONET_SOURCE_PLAY_SERVICES,
        CRONET_SOURCE_FALLBACK,
        CRONET_SOURCE_PLATFORM,
        CRONET_SOURCE_FAKE
    }

    public static class CronetTrafficInfo {
        public final long A;
        public final long B;
        public final java.lang.Boolean C;
        public final boolean D;
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final int e;
        public final j$.time.Duration f;
        public final java.lang.String g;
        public final boolean h;
        public final boolean i;
        public final org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState j;
        public final int k;
        public final int l;
        public final int m;
        public final boolean n;
        public final boolean o;
        public final int p;
        public final int q;
        public final int r;
        public final int s;
        public final org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestFailureReason t;
        public final boolean u;
        public final java.lang.String v;
        public final org.chromium.net.impl.CronetLogger.CronetSource w;
        public final long x;
        public final long y;
        public final long z;

        public enum RequestFailureReason {
            UNKNOWN,
            NETWORK,
            OTHER
        }

        public enum RequestTerminalState {
            SUCCEEDED,
            ERROR,
            CANCELLED
        }

        public CronetTrafficInfo(long j, long j2, long j3, long j4, int i, j$.time.Duration duration, java.lang.String str, boolean z, boolean z2, org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState, int i2, int i3, int i4, boolean z3, boolean z4, int i5, int i6, int i7, int i8, org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason, boolean z5, java.lang.String str2, org.chromium.net.impl.CronetLogger.CronetSource cronetSource, long j5, long j6, long j7, long j8, long j9, java.lang.Boolean bool, boolean z6) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = i;
            this.f = duration;
            this.g = str;
            this.h = z;
            this.i = z2;
            this.j = requestTerminalState;
            this.k = i2;
            this.l = i3;
            this.m = i4;
            this.n = z3;
            this.o = z4;
            this.p = i5;
            this.q = i6;
            this.r = i7;
            this.s = i8;
            this.t = requestFailureReason;
            this.u = z5;
            this.v = str2;
            this.w = cronetSource;
            this.x = j5;
            this.y = j6;
            this.z = j7;
            this.A = j8;
            this.B = j9;
            this.C = bool;
            this.D = z6;
        }
    }

    public static class CronetVersion {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public CronetVersion(java.lang.String str) {
            java.lang.String[] strArrSplit = str.split("\\.");
            this.a = java.lang.Integer.parseInt(strArrSplit[0]);
            this.b = java.lang.Integer.parseInt(strArrSplit[1]);
            this.c = java.lang.Integer.parseInt(strArrSplit[2]);
            this.d = java.lang.Integer.parseInt(strArrSplit[3]);
        }

        public final java.lang.String toString() {
            return this.a + "." + this.b + "." + this.c + "." + this.d;
        }
    }

    public abstract long a();

    public abstract void b(org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo);

    public abstract void c(long j, org.chromium.net.impl.CronetLogger.CronetEngineBuilderInfo cronetEngineBuilderInfo, org.chromium.net.impl.CronetLogger.CronetVersion cronetVersion, org.chromium.net.impl.CronetLogger.CronetSource cronetSource);

    public abstract void d(long j, org.chromium.net.impl.CronetLogger.CronetTrafficInfo cronetTrafficInfo);
}
