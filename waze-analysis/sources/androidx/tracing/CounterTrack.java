package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class CounterTrack extends Track implements Counter {
    private final String name;
    private final Object packetLock;
    private final Track parent;

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x00be, TryCatch #2 {, blocks: (B:5:0x0021, B:7:0x0028, B:9:0x002c, B:10:0x002e, B:14:0x003e, B:17:0x0042, B:18:0x0043, B:19:0x0044, B:20:0x004a, B:22:0x004f, B:25:0x0060, B:28:0x007a, B:30:0x007e, B:32:0x0082, B:33:0x0087, B:35:0x0091, B:36:0x0094, B:38:0x009f, B:39:0x00a1, B:43:0x00b1, B:46:0x00b4, B:47:0x00b5, B:48:0x00b6, B:23:0x0058, B:11:0x002f, B:13:0x0033, B:40:0x00a2, B:42:0x00a6), top: B:59:0x0021, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[Catch: all -> 0x00be, TryCatch #2 {, blocks: (B:5:0x0021, B:7:0x0028, B:9:0x002c, B:10:0x002e, B:14:0x003e, B:17:0x0042, B:18:0x0043, B:19:0x0044, B:20:0x004a, B:22:0x004f, B:25:0x0060, B:28:0x007a, B:30:0x007e, B:32:0x0082, B:33:0x0087, B:35:0x0091, B:36:0x0094, B:38:0x009f, B:39:0x00a1, B:43:0x00b1, B:46:0x00b4, B:47:0x00b5, B:48:0x00b6, B:23:0x0058, B:11:0x002f, B:13:0x0033, B:40:0x00a2, B:42:0x00a6), top: B:59:0x0021, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: all -> 0x00be, TryCatch #2 {, blocks: (B:5:0x0021, B:7:0x0028, B:9:0x002c, B:10:0x002e, B:14:0x003e, B:17:0x0042, B:18:0x0043, B:19:0x0044, B:20:0x004a, B:22:0x004f, B:25:0x0060, B:28:0x007a, B:30:0x007e, B:32:0x0082, B:33:0x0087, B:35:0x0091, B:36:0x0094, B:38:0x009f, B:39:0x00a1, B:43:0x00b1, B:46:0x00b4, B:47:0x00b5, B:48:0x00b6, B:23:0x0058, B:11:0x002f, B:13:0x0033, B:40:0x00a2, B:42:0x00a6), top: B:59:0x0021, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CounterTrack(java.lang.String r17, androidx.tracing.Track r18) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.CounterTrack.<init>(java.lang.String, androidx.tracing.Track):void");
    }

    public final String getName() {
        return this.name;
    }

    public final Object getPacketLock$tracing() {
        return this.packetLock;
    }

    public final Track getParent() {
        return this.parent;
    }

    @Override // androidx.tracing.Counter
    public String name() {
        return this.name;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[Catch: all -> 0x00aa, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0014, B:11:0x0016, B:15:0x0026, B:18:0x002a, B:19:0x002b, B:20:0x002c, B:21:0x0032, B:23:0x0037, B:26:0x0048, B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x006a, B:36:0x006f, B:38:0x0079, B:40:0x007f, B:42:0x008a, B:43:0x008c, B:47:0x009c, B:50:0x00a0, B:51:0x00a1, B:52:0x00a2, B:24:0x0040, B:12:0x0017, B:14:0x001b, B:44:0x008d, B:46:0x0091), top: B:61:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040 A[Catch: all -> 0x00aa, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0014, B:11:0x0016, B:15:0x0026, B:18:0x002a, B:19:0x002b, B:20:0x002c, B:21:0x0032, B:23:0x0037, B:26:0x0048, B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x006a, B:36:0x006f, B:38:0x0079, B:40:0x007f, B:42:0x008a, B:43:0x008c, B:47:0x009c, B:50:0x00a0, B:51:0x00a1, B:52:0x00a2, B:24:0x0040, B:12:0x0017, B:14:0x001b, B:44:0x008d, B:46:0x0091), top: B:61:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[Catch: all -> 0x00aa, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0014, B:11:0x0016, B:15:0x0026, B:18:0x002a, B:19:0x002b, B:20:0x002c, B:21:0x0032, B:23:0x0037, B:26:0x0048, B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x006a, B:36:0x006f, B:38:0x0079, B:40:0x007f, B:42:0x008a, B:43:0x008c, B:47:0x009c, B:50:0x00a0, B:51:0x00a1, B:52:0x00a2, B:24:0x0040, B:12:0x0017, B:14:0x001b, B:44:0x008d, B:46:0x0091), top: B:61:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[Catch: all -> 0x00aa, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0014, B:11:0x0016, B:15:0x0026, B:18:0x002a, B:19:0x002b, B:20:0x002c, B:21:0x0032, B:23:0x0037, B:26:0x0048, B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x006a, B:36:0x006f, B:38:0x0079, B:40:0x007f, B:42:0x008a, B:43:0x008c, B:47:0x009c, B:50:0x00a0, B:51:0x00a1, B:52:0x00a2, B:24:0x0040, B:12:0x0017, B:14:0x001b, B:44:0x008d, B:46:0x0091), top: B:61:0x0009, inners: #0, #2 }] */
    @Override // androidx.tracing.Counter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setValue(double r7) {
        /*
            r6 = this;
            androidx.tracing.TraceContext r0 = r6.context
            boolean r0 = r0.isGloballyEnabled
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r6.packetLock
            monitor-enter(r0)
            r1 = r6
            androidx.tracing.Track r1 = (androidx.tracing.Track) r1     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.PooledTracePacketArray r2 = r1.currentPacketArray     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L32
            androidx.tracing.ProtoPool r2 = r1.pool     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L2c
            java.lang.Object r2 = r1.lock     // Catch: java.lang.Throwable -> Laa
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.ProtoPool r3 = r1.pool     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L26
            androidx.tracing.ProtoPool r3 = new androidx.tracing.ProtoPool     // Catch: java.lang.Throwable -> L29
            androidx.tracing.TraceContext r4 = r1.context     // Catch: java.lang.Throwable -> L29
            boolean r4 = r4.isDebug     // Catch: java.lang.Throwable -> L29
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L29
            r1.pool = r3     // Catch: java.lang.Throwable -> L29
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laa
            r2 = r3
            goto L2c
        L29:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laa
            throw r6     // Catch: java.lang.Throwable -> Laa
        L2c:
            androidx.tracing.PooledTracePacketArray r2 = r2.obtainTracePacketArray()     // Catch: java.lang.Throwable -> Laa
            r1.currentPacketArray = r2     // Catch: java.lang.Throwable -> Laa
        L32:
            androidx.tracing.PooledTracePacketArray r2 = r1.currentPacketArray     // Catch: java.lang.Throwable -> Laa
            r3 = 0
            if (r2 != 0) goto L40
            androidx.tracing.TraceContext r2 = r1.context     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.AbstractTraceSink r2 = r2.sink     // Catch: java.lang.Throwable -> Laa
            r2.onDroppedTraceEvent()     // Catch: java.lang.Throwable -> Laa
            r2 = r3
            goto L46
        L40:
            androidx.tracing.TraceEvent[] r4 = r2.packets     // Catch: java.lang.Throwable -> Laa
            int r2 = r2.fillCount     // Catch: java.lang.Throwable -> Laa
            r2 = r4[r2]     // Catch: java.lang.Throwable -> Laa
        L46:
            if (r2 == 0) goto L5b
            long r4 = r6.uuid     // Catch: java.lang.Throwable -> Laa
            r6 = 4
            r2.type = r6     // Catch: java.lang.Throwable -> Laa
            r2.trackUuid = r4     // Catch: java.lang.Throwable -> Laa
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Laa
            r2.timestamp = r4     // Catch: java.lang.Throwable -> Laa
            java.lang.Double r6 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Throwable -> Laa
            r2.counterDoubleValue = r6     // Catch: java.lang.Throwable -> Laa
        L5b:
            if (r2 == 0) goto La8
            androidx.tracing.PooledTracePacketArray r6 = r1.currentPacketArray     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto L62
            goto La8
        L62:
            androidx.tracing.PooledTracePacketArray r7 = r1.currentPacketArray     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L6f
            androidx.tracing.TraceEvent[] r7 = r7.packets     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L6f
            int r7 = r7.length     // Catch: java.lang.Throwable -> Laa
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Laa
        L6f:
            int r7 = r6.fillCount     // Catch: java.lang.Throwable -> Laa
            int r7 = r7 + 1
            r6.fillCount = r7     // Catch: java.lang.Throwable -> Laa
            int r7 = r6.fillCount     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto La8
            int r8 = r3.intValue()     // Catch: java.lang.Throwable -> Laa
            if (r7 != r8) goto La8
            androidx.tracing.TraceContext r7 = r1.context     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.AbstractTraceSink r7 = r7.sink     // Catch: java.lang.Throwable -> Laa
            r7.enqueue(r6)     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.ProtoPool r6 = r1.pool     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto La2
            java.lang.Object r6 = r1.lock     // Catch: java.lang.Throwable -> Laa
            monitor-enter(r6)     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.ProtoPool r7 = r1.pool     // Catch: java.lang.Throwable -> L9f
            if (r7 != 0) goto L9c
            androidx.tracing.ProtoPool r7 = new androidx.tracing.ProtoPool     // Catch: java.lang.Throwable -> L9f
            androidx.tracing.TraceContext r8 = r1.context     // Catch: java.lang.Throwable -> L9f
            boolean r8 = r8.isDebug     // Catch: java.lang.Throwable -> L9f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9f
            r1.pool = r7     // Catch: java.lang.Throwable -> L9f
        L9c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Laa
            r6 = r7
            goto La2
        L9f:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Laa
            throw r7     // Catch: java.lang.Throwable -> Laa
        La2:
            androidx.tracing.PooledTracePacketArray r6 = r6.obtainTracePacketArray()     // Catch: java.lang.Throwable -> Laa
            r1.currentPacketArray = r6     // Catch: java.lang.Throwable -> Laa
        La8:
            monitor-exit(r0)
            return
        Laa:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.CounterTrack.setValue(double):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[Catch: all -> 0x00aa, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0014, B:11:0x0016, B:15:0x0026, B:18:0x002a, B:19:0x002b, B:20:0x002c, B:21:0x0032, B:23:0x0037, B:26:0x0048, B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x006a, B:36:0x006f, B:38:0x0079, B:40:0x007f, B:42:0x008a, B:43:0x008c, B:47:0x009c, B:50:0x00a0, B:51:0x00a1, B:52:0x00a2, B:24:0x0040, B:12:0x0017, B:14:0x001b, B:44:0x008d, B:46:0x0091), top: B:61:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040 A[Catch: all -> 0x00aa, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0014, B:11:0x0016, B:15:0x0026, B:18:0x002a, B:19:0x002b, B:20:0x002c, B:21:0x0032, B:23:0x0037, B:26:0x0048, B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x006a, B:36:0x006f, B:38:0x0079, B:40:0x007f, B:42:0x008a, B:43:0x008c, B:47:0x009c, B:50:0x00a0, B:51:0x00a1, B:52:0x00a2, B:24:0x0040, B:12:0x0017, B:14:0x001b, B:44:0x008d, B:46:0x0091), top: B:61:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[Catch: all -> 0x00aa, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0014, B:11:0x0016, B:15:0x0026, B:18:0x002a, B:19:0x002b, B:20:0x002c, B:21:0x0032, B:23:0x0037, B:26:0x0048, B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x006a, B:36:0x006f, B:38:0x0079, B:40:0x007f, B:42:0x008a, B:43:0x008c, B:47:0x009c, B:50:0x00a0, B:51:0x00a1, B:52:0x00a2, B:24:0x0040, B:12:0x0017, B:14:0x001b, B:44:0x008d, B:46:0x0091), top: B:61:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[Catch: all -> 0x00aa, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0014, B:11:0x0016, B:15:0x0026, B:18:0x002a, B:19:0x002b, B:20:0x002c, B:21:0x0032, B:23:0x0037, B:26:0x0048, B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x006a, B:36:0x006f, B:38:0x0079, B:40:0x007f, B:42:0x008a, B:43:0x008c, B:47:0x009c, B:50:0x00a0, B:51:0x00a1, B:52:0x00a2, B:24:0x0040, B:12:0x0017, B:14:0x001b, B:44:0x008d, B:46:0x0091), top: B:61:0x0009, inners: #0, #2 }] */
    @Override // androidx.tracing.Counter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setValue(long r7) {
        /*
            r6 = this;
            androidx.tracing.TraceContext r0 = r6.context
            boolean r0 = r0.isGloballyEnabled
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r6.packetLock
            monitor-enter(r0)
            r1 = r6
            androidx.tracing.Track r1 = (androidx.tracing.Track) r1     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.PooledTracePacketArray r2 = r1.currentPacketArray     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L32
            androidx.tracing.ProtoPool r2 = r1.pool     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L2c
            java.lang.Object r2 = r1.lock     // Catch: java.lang.Throwable -> Laa
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.ProtoPool r3 = r1.pool     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L26
            androidx.tracing.ProtoPool r3 = new androidx.tracing.ProtoPool     // Catch: java.lang.Throwable -> L29
            androidx.tracing.TraceContext r4 = r1.context     // Catch: java.lang.Throwable -> L29
            boolean r4 = r4.isDebug     // Catch: java.lang.Throwable -> L29
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L29
            r1.pool = r3     // Catch: java.lang.Throwable -> L29
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laa
            r2 = r3
            goto L2c
        L29:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laa
            throw r6     // Catch: java.lang.Throwable -> Laa
        L2c:
            androidx.tracing.PooledTracePacketArray r2 = r2.obtainTracePacketArray()     // Catch: java.lang.Throwable -> Laa
            r1.currentPacketArray = r2     // Catch: java.lang.Throwable -> Laa
        L32:
            androidx.tracing.PooledTracePacketArray r2 = r1.currentPacketArray     // Catch: java.lang.Throwable -> Laa
            r3 = 0
            if (r2 != 0) goto L40
            androidx.tracing.TraceContext r2 = r1.context     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.AbstractTraceSink r2 = r2.sink     // Catch: java.lang.Throwable -> Laa
            r2.onDroppedTraceEvent()     // Catch: java.lang.Throwable -> Laa
            r2 = r3
            goto L46
        L40:
            androidx.tracing.TraceEvent[] r4 = r2.packets     // Catch: java.lang.Throwable -> Laa
            int r2 = r2.fillCount     // Catch: java.lang.Throwable -> Laa
            r2 = r4[r2]     // Catch: java.lang.Throwable -> Laa
        L46:
            if (r2 == 0) goto L5b
            long r4 = r6.uuid     // Catch: java.lang.Throwable -> Laa
            r6 = 4
            r2.type = r6     // Catch: java.lang.Throwable -> Laa
            r2.trackUuid = r4     // Catch: java.lang.Throwable -> Laa
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Laa
            r2.timestamp = r4     // Catch: java.lang.Throwable -> Laa
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Laa
            r2.counterLongValue = r6     // Catch: java.lang.Throwable -> Laa
        L5b:
            if (r2 == 0) goto La8
            androidx.tracing.PooledTracePacketArray r6 = r1.currentPacketArray     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto L62
            goto La8
        L62:
            androidx.tracing.PooledTracePacketArray r7 = r1.currentPacketArray     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L6f
            androidx.tracing.TraceEvent[] r7 = r7.packets     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L6f
            int r7 = r7.length     // Catch: java.lang.Throwable -> Laa
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Laa
        L6f:
            int r7 = r6.fillCount     // Catch: java.lang.Throwable -> Laa
            int r7 = r7 + 1
            r6.fillCount = r7     // Catch: java.lang.Throwable -> Laa
            int r7 = r6.fillCount     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto La8
            int r8 = r3.intValue()     // Catch: java.lang.Throwable -> Laa
            if (r7 != r8) goto La8
            androidx.tracing.TraceContext r7 = r1.context     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.AbstractTraceSink r7 = r7.sink     // Catch: java.lang.Throwable -> Laa
            r7.enqueue(r6)     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.ProtoPool r6 = r1.pool     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto La2
            java.lang.Object r6 = r1.lock     // Catch: java.lang.Throwable -> Laa
            monitor-enter(r6)     // Catch: java.lang.Throwable -> Laa
            androidx.tracing.ProtoPool r7 = r1.pool     // Catch: java.lang.Throwable -> L9f
            if (r7 != 0) goto L9c
            androidx.tracing.ProtoPool r7 = new androidx.tracing.ProtoPool     // Catch: java.lang.Throwable -> L9f
            androidx.tracing.TraceContext r8 = r1.context     // Catch: java.lang.Throwable -> L9f
            boolean r8 = r8.isDebug     // Catch: java.lang.Throwable -> L9f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9f
            r1.pool = r7     // Catch: java.lang.Throwable -> L9f
        L9c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Laa
            r6 = r7
            goto La2
        L9f:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Laa
            throw r7     // Catch: java.lang.Throwable -> Laa
        La2:
            androidx.tracing.PooledTracePacketArray r6 = r6.obtainTracePacketArray()     // Catch: java.lang.Throwable -> Laa
            r1.currentPacketArray = r6     // Catch: java.lang.Throwable -> Laa
        La8:
            monitor-exit(r0)
            return
        Laa:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.CounterTrack.setValue(long):void");
    }
}
