package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.Frame;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.FrameState;
import androidx.camera.camera2.pipe.media.OutputImage;
import androidx.camera.camera2.pipe.media.SharedOutputImage;
import h.a.i;
import h.c.e;
import h.e.b;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameImpl implements Frame {
    private final a _isExternal;
    private final a closed;
    private final FrameState frameState;
    private final Set<StreamId> imageStreams;
    private final Set<OutputId> outputStreams;

    public FrameImpl(FrameState frameState, Set<StreamId> set) {
        x.f(frameState, "frameState");
        x.f(set, "imageStreams");
        this.frameState = frameState;
        this.imageStreams = set;
        List<FrameState.ImageOutput> imageOutputs = frameState.getImageOutputs();
        ArrayList arrayList = new ArrayList(i.q(imageOutputs, 10));
        Iterator<T> it = imageOutputs.iterator();
        while (it.hasNext()) {
            arrayList.add(OutputId.m734boximpl(((FrameState.ImageOutput) it.next()).m1220getOutputId4LaLFng()));
        }
        this.outputStreams = i.au(arrayList);
        this.closed = b.e(false);
        this._isExternal = b.e(false);
    }

    private final boolean release() {
        if (!this.closed.b(false, true)) {
            return false;
        }
        this.frameState.getFrameInfoOutput().decrement();
        int size = this.frameState.getImageOutputs().size();
        for (int i2 = 0; i2 < size; i2++) {
            FrameState.ImageOutput imageOutput = this.frameState.getImageOutputs().get(i2);
            if (getImageStreams().contains(StreamId.m974boximpl(imageOutput.m1221getStreamIdptHMqGs()))) {
                imageOutput.decrement();
                if (this._isExternal.c()) {
                    imageOutput.decrementExternalUseCount();
                }
            }
        }
        return true;
    }

    private final FrameImpl tryAcquireForUsageType(Set<StreamId> set, boolean z) {
        boolean z2;
        if (this.closed.c() || !this.frameState.getFrameInfoOutput().increment()) {
            return null;
        }
        FrameState frameState = this.frameState;
        Set setM = e.c.d.a.m();
        Iterator<FrameState.ImageOutput> it = frameState.getImageOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = true;
                break;
            }
            FrameState.ImageOutput next = it.next();
            int iM1221getStreamIdptHMqGs = next.m1221getStreamIdptHMqGs();
            if (getImageStreams().contains(StreamId.m974boximpl(iM1221getStreamIdptHMqGs)) && (set == null || set.contains(StreamId.m974boximpl(iM1221getStreamIdptHMqGs)))) {
                if (!next.increment()) {
                    z2 = false;
                    break;
                }
                setM.add(StreamId.m974boximpl(iM1221getStreamIdptHMqGs));
            }
        }
        Set setL = e.c.d.a.l(setM);
        FrameState frameState2 = this.frameState;
        if (z2) {
            FrameImpl frameImpl = new FrameImpl(frameState2, setL);
            if (z) {
                frameImpl.setExternal$camera_camera2_pipe(true);
            }
            return frameImpl;
        }
        frameState2.getFrameInfoOutput().decrement();
        for (FrameState.ImageOutput imageOutput : this.frameState.getImageOutputs()) {
            if (setL.contains(StreamId.m974boximpl(imageOutput.m1221getStreamIdptHMqGs()))) {
                imageOutput.decrement();
            }
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.Frame
    public void addListener(Frame.Listener listener) {
        x.f(listener, "listener");
        if (!this.closed.c()) {
            this.frameState.addListener(listener);
            return;
        }
        throw new IllegalStateException("Cannot add Frame.Listener, " + this + " is closed!");
    }

    @Override // androidx.camera.camera2.pipe.Frame
    public Object awaitFrameInfo(e<? super FrameInfo> eVar) {
        return this.frameState.getFrameInfoOutput().await(eVar);
    }

    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: awaitImage-A9nWXxg */
    public Object mo641awaitImageA9nWXxg(int i2, e<? super OutputImage> eVar) {
        Object next;
        if (this.closed.c() || !this.outputStreams.contains(OutputId.m734boximpl(i2))) {
            return null;
        }
        Iterator<T> it = this.frameState.getImageOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (OutputId.m737equalsimpl0(((FrameState.ImageOutput) next).m1220getOutputId4LaLFng(), i2)) {
                break;
            }
        }
        FrameState.ImageOutput imageOutput = (FrameState.ImageOutput) next;
        if (imageOutput == null) {
            return null;
        }
        Object objAwaitForExternalUse = imageOutput.awaitForExternalUse(eVar);
        return objAwaitForExternalUse == h.c.a.a.f48038a ? objAwaitForExternalUse : (SharedOutputImage) objAwaitForExternalUse;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b3 -> B:39:0x00b6). Please report as a decompilation issue!!! */
    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: awaitImage-NYG5g8E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo642awaitImageNYG5g8E(int r7, h.c.e<? super androidx.camera.camera2.pipe.media.OutputImage> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1 r0 = (androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1 r0 = new androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.L$0
            java.util.Iterator r6 = (java.util.Iterator) r6
            e.b.c.b(r8)
            goto Lb6
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            e.b.c.b(r8)
            kotlinx.a.a r8 = r6.closed
            boolean r8 = r8.c()
            if (r8 == 0) goto L41
            return r3
        L41:
            java.util.Set r8 = r6.getImageStreams()
            androidx.camera.camera2.pipe.StreamId r2 = androidx.camera.camera2.pipe.StreamId.m974boximpl(r7)
            boolean r8 = r8.contains(r2)
            if (r8 != 0) goto L50
            return r3
        L50:
            androidx.camera.camera2.pipe.internal.FrameState r8 = r6.frameState
            java.util.Set r8 = r8.getConcurrentImageStreams()
            if (r8 == 0) goto L6b
            androidx.camera.camera2.pipe.StreamId r2 = androidx.camera.camera2.pipe.StreamId.m974boximpl(r7)
            boolean r8 = r8.contains(r2)
            if (r8 == r4) goto L63
            goto L6b
        L63:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This is a multi-output stream, use awaitImage(outputId) or awaitImages(streamId) to acquire image(s)"
            r6.<init>(r7)
            throw r6
        L6b:
            androidx.camera.camera2.pipe.internal.FrameState r6 = r6.frameState
            java.util.List r6 = r6.getImageOutputs()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r6 = r6.iterator()
        L7e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L99
            java.lang.Object r2 = r6.next()
            r5 = r2
            androidx.camera.camera2.pipe.internal.FrameState$ImageOutput r5 = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) r5
            int r5 = r5.m1221getStreamIdptHMqGs()
            boolean r5 = androidx.camera.camera2.pipe.StreamId.m977equalsimpl0(r5, r7)
            if (r5 == 0) goto L7e
            r8.add(r2)
            goto L7e
        L99:
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r6 = r8.iterator()
        L9f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lbc
            java.lang.Object r7 = r6.next()
            androidx.camera.camera2.pipe.internal.FrameState$ImageOutput r7 = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) r7
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r7.awaitForExternalUse(r0)
            if (r8 != r1) goto Lb6
            return r1
        Lb6:
            androidx.camera.camera2.pipe.media.SharedOutputImage r8 = (androidx.camera.camera2.pipe.media.SharedOutputImage) r8
            if (r8 != 0) goto Lbb
            goto L9f
        Lbb:
            return r8
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameImpl.mo642awaitImageNYG5g8E(int, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b1 -> B:34:0x00b4). Please report as a decompilation issue!!! */
    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: awaitImages-NYG5g8E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo643awaitImagesNYG5g8E(int r7, h.c.e<? super java.util.List<? extends androidx.camera.camera2.pipe.media.OutputImage>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1 r0 = (androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1 r0 = new androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$0
            java.util.Collection r7 = (java.util.Collection) r7
            e.b.c.b(r8)
            goto Lb4
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            e.b.c.b(r8)
            kotlinx.a.a r8 = r6.closed
            boolean r8 = r8.c()
            if (r8 == 0) goto L48
            java.util.List r6 = h.a.i.h()
            return r6
        L48:
            java.util.Set r8 = r6.getImageStreams()
            androidx.camera.camera2.pipe.StreamId r2 = androidx.camera.camera2.pipe.StreamId.m974boximpl(r7)
            boolean r8 = r8.contains(r2)
            if (r8 != 0) goto L5b
            java.util.List r6 = h.a.i.h()
            return r6
        L5b:
            androidx.camera.camera2.pipe.internal.FrameState r6 = r6.frameState
            java.util.List r6 = r6.getImageOutputs()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r6 = r6.iterator()
        L6e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r6.next()
            r4 = r2
            androidx.camera.camera2.pipe.internal.FrameState$ImageOutput r4 = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) r4
            int r4 = r4.m1221getStreamIdptHMqGs()
            boolean r4 = androidx.camera.camera2.pipe.StreamId.m977equalsimpl0(r4, r7)
            if (r4 == 0) goto L6e
            r8.add(r2)
            goto L6e
        L89:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r7 = r8.iterator()
            r5 = r7
            r7 = r6
            r6 = r5
        L9b:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lbc
            java.lang.Object r8 = r6.next()
            androidx.camera.camera2.pipe.internal.FrameState$ImageOutput r8 = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) r8
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r8.awaitForExternalUse(r0)
            if (r8 != r1) goto Lb4
            return r1
        Lb4:
            androidx.camera.camera2.pipe.media.SharedOutputImage r8 = (androidx.camera.camera2.pipe.media.SharedOutputImage) r8
            if (r8 == 0) goto L9b
            r7.add(r8)
            goto L9b
        Lbc:
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameImpl.mo643awaitImagesNYG5g8E(int, h.c.e):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        release();
    }

    protected final void finalize() {
        if (release() && Log.INSTANCE.getERROR_LOGGABLE()) {
            android.util.Log.e(Log.TAG, "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: getFrameId-OMxQvVY */
    public long mo697getFrameIdOMxQvVY() {
        return this.frameState.m1212getFrameIdOMxQvVY();
    }

    @Override // androidx.camera.camera2.pipe.Frame
    public FrameInfo getFrameInfo() {
        return this.frameState.getFrameInfoOutput().outputOrNull();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: getFrameInfoStatus-U7r42EA */
    public int mo698getFrameInfoStatusU7r42EA() {
        return this.closed.c() ? OutputStatus.Companion.m754getUNAVAILABLEU7r42EA() : this.frameState.getFrameInfoOutput().m1219getStatusU7r42EA();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: getFrameNumber-Ugla2oM */
    public long mo699getFrameNumberUgla2oM() {
        return this.frameState.m1213getFrameNumberUgla2oM();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: getFrameTimestamp-LS1Wq50 */
    public long mo700getFrameTimestampLS1Wq50() {
        return this.frameState.m1214getFrameTimestampLS1Wq50();
    }

    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: getImage-aKI5c8E */
    public OutputImage mo644getImageaKI5c8E(int i2) {
        if (this.closed.c() || !getImageStreams().contains(StreamId.m974boximpl(i2))) {
            return null;
        }
        Set<StreamId> concurrentImageStreams = this.frameState.getConcurrentImageStreams();
        if (concurrentImageStreams != null && concurrentImageStreams.contains(StreamId.m974boximpl(i2))) {
            throw new IllegalStateException("This is a multi-output stream, use awaitImage(outputId) or awaitImages(streamId) to acquire image(s)");
        }
        List<FrameState.ImageOutput> imageOutputs = this.frameState.getImageOutputs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : imageOutputs) {
            if (StreamId.m977equalsimpl0(((FrameState.ImageOutput) obj).m1221getStreamIdptHMqGs(), i2)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SharedOutputImage sharedOutputImageAcquireOrNullForExternalUse = ((FrameState.ImageOutput) it.next()).acquireOrNullForExternalUse();
            if (sharedOutputImageAcquireOrNullForExternalUse != null) {
                return sharedOutputImageAcquireOrNullForExternalUse;
            }
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: getImage-iYJqvbA */
    public OutputImage mo645getImageiYJqvbA(int i2) {
        Object next;
        if (this.closed.c() || !this.outputStreams.contains(OutputId.m734boximpl(i2))) {
            return null;
        }
        Iterator<T> it = this.frameState.getImageOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (OutputId.m737equalsimpl0(((FrameState.ImageOutput) next).m1220getOutputId4LaLFng(), i2)) {
                break;
            }
        }
        FrameState.ImageOutput imageOutput = (FrameState.ImageOutput) next;
        return imageOutput != null ? imageOutput.acquireOrNullForExternalUse() : null;
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    public Set<StreamId> getImageStreams() {
        return this.imageStreams;
    }

    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: getImages-aKI5c8E */
    public List<OutputImage> mo646getImagesaKI5c8E(int i2) {
        if (this.closed.c()) {
            return i.h();
        }
        if (!getImageStreams().contains(StreamId.m974boximpl(i2))) {
            return i.h();
        }
        List<FrameState.ImageOutput> imageOutputs = this.frameState.getImageOutputs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : imageOutputs) {
            if (StreamId.m977equalsimpl0(((FrameState.ImageOutput) obj).m1221getStreamIdptHMqGs(), i2)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SharedOutputImage sharedOutputImageAcquireOrNullForExternalUse = ((FrameState.ImageOutput) it.next()).acquireOrNullForExternalUse();
            if (sharedOutputImageAcquireOrNullForExternalUse != null) {
                arrayList2.add(sharedOutputImageAcquireOrNullForExternalUse);
            }
        }
        return arrayList2;
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    public RequestMetadata getRequestMetadata() {
        return this.frameState.getRequestMetadata();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: imageStatus-BWjvHWQ */
    public int mo701imageStatusBWjvHWQ(int i2) {
        Object next;
        if (this.closed.c() || !this.outputStreams.contains(OutputId.m734boximpl(i2))) {
            return OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
        }
        Iterator<T> it = this.frameState.getImageOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (OutputId.m737equalsimpl0(((FrameState.ImageOutput) next).m1220getOutputId4LaLFng(), i2)) {
                break;
            }
        }
        FrameState.ImageOutput imageOutput = (FrameState.ImageOutput) next;
        return imageOutput != null ? imageOutput.m1219getStatusU7r42EA() : OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: imageStatus-Oo2lJfM */
    public int mo702imageStatusOo2lJfM(int i2) {
        if (this.closed.c() || !getImageStreams().contains(StreamId.m974boximpl(i2))) {
            return OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
        }
        List<FrameState.ImageOutput> imageOutputs = this.frameState.getImageOutputs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : imageOutputs) {
            if (StreamId.m977equalsimpl0(((FrameState.ImageOutput) obj).m1221getStreamIdptHMqGs(), i2)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(i.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(OutputStatus.m741boximpl(((FrameState.ImageOutput) it.next()).m1219getStatusU7r42EA()));
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            throw new IllegalStateException("No matching outputs found with " + StreamId.m979toStringimpl(i2) + ". This is unexpected.");
        }
        if (arrayList4.size() == 1) {
            return ((OutputStatus) arrayList4.get(0)).m747unboximpl();
        }
        ArrayList arrayList5 = arrayList4;
        boolean z = arrayList5 instanceof Collection;
        if (!z || !arrayList5.isEmpty()) {
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                if (OutputStatus.m744equalsimpl0(((OutputStatus) it2.next()).m747unboximpl(), OutputStatus.Companion.m753getPENDINGU7r42EA())) {
                    return OutputStatus.Companion.m753getPENDINGU7r42EA();
                }
            }
        }
        if (!z || !arrayList5.isEmpty()) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                if (OutputStatus.m744equalsimpl0(((OutputStatus) it3.next()).m747unboximpl(), OutputStatus.Companion.m748getAVAILABLEU7r42EA())) {
                    return OutputStatus.Companion.m748getAVAILABLEU7r42EA();
                }
            }
        }
        if (!z || !arrayList5.isEmpty()) {
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                if (!OutputStatus.m744equalsimpl0(((OutputStatus) it4.next()).m747unboximpl(), ((OutputStatus) i.P(arrayList4)).m747unboximpl())) {
                    return OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
                }
            }
        }
        return ((OutputStatus) i.P(arrayList4)).m747unboximpl();
    }

    public final boolean isExternal$camera_camera2_pipe() {
        return this._isExternal.c();
    }

    public final void setExternal$camera_camera2_pipe(boolean z) {
        if (!z) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Attempted to set isExternal to false on " + this + ", which is not supported.");
                return;
            }
            return;
        }
        if (this._isExternal.b(false, true)) {
            for (FrameState.ImageOutput imageOutput : this.frameState.getImageOutputs()) {
                if (getImageStreams().contains(StreamId.m974boximpl(imageOutput.m1221getStreamIdptHMqGs()))) {
                    imageOutput.incrementExternalUseCount();
                }
            }
        }
    }

    public String toString() {
        return this.frameState.toString();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    public /* bridge */ /* synthetic */ Frame tryAcquire(Set set) {
        return tryAcquire((Set<StreamId>) set);
    }

    public final FrameImpl tryAcquireForInternalUse$camera_camera2_pipe(Set<StreamId> set) {
        return tryAcquireForUsageType(set, false);
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    public FrameImpl tryAcquire(Set<StreamId> set) {
        return tryAcquireForUsageType(set, true);
    }

    public /* synthetic */ FrameImpl(FrameState frameState, Set set, int i2, o oVar) {
        if ((i2 & 2) != 0) {
            List<FrameState.ImageOutput> imageOutputs = frameState.getImageOutputs();
            ArrayList arrayList = new ArrayList(i.q(imageOutputs, 10));
            Iterator<T> it = imageOutputs.iterator();
            while (it.hasNext()) {
                arrayList.add(StreamId.m974boximpl(((FrameState.ImageOutput) it.next()).m1221getStreamIdptHMqGs()));
            }
            set = i.au(arrayList);
        }
        this(frameState, set);
    }
}
