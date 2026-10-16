package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.CameraXTracer;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.imagecapture.DngImage2Disk;
import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ProcessingNode implements Node<In, Void> {
    private static final String TAG = "ProcessingNode";
    private Operation<Bitmap2JpegBytes.In, Packet<byte[]>> mBitmap2JpegBytes;
    private Operation<Packet<Bitmap>, Packet<Bitmap>> mBitmapEffect;
    final Executor mBlockingExecutor;
    private final CameraCharacteristics mCameraCharacteristics;
    DngImage2Disk mDngImage2Disk;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private Operation<Packet<ImageProxy>, Bitmap> mImage2Bitmap;
    private Operation<Image2JpegBytes.In, Packet<byte[]>> mImage2JpegBytes;
    final InternalImageProcessor mImageProcessor;
    private Operation<InputPacket, Packet<ImageProxy>> mInput2Packet;
    private In mInputEdge;
    private Operation<Packet<byte[]>, Packet<Bitmap>> mJpegBytes2CroppedBitmap;
    private Operation<JpegBytes2Disk.In, ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private Operation<Packet<byte[]>, Packet<ImageProxy>> mJpegBytes2Image;
    private Operation<Packet<ImageProxy>, ImageProxy> mJpegImage2Result;
    private final Quirks mQuirks;

    /* compiled from: WazeSource */
    abstract class In {
        In() {
        }

        static In of(int i2, List<Integer> list) {
            return new AutoValue_ProcessingNode_In(new Edge(), new Edge(), i2, list);
        }

        abstract Edge<InputPacket> getEdge();

        abstract int getInputFormat();

        abstract List<Integer> getOutputFormats();

        abstract Edge<InputPacket> getPostviewEdge();
    }

    /* compiled from: WazeSource */
    abstract class InputPacket {
        InputPacket() {
        }

        static InputPacket of(ProcessingRequest processingRequest, ImageProxy imageProxy) {
            return new AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }

        abstract ImageProxy getImageProxy();

        abstract ProcessingRequest getProcessingRequest();
    }

    ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics, InternalImageProcessor internalImageProcessor, Quirks quirks) {
        if (DeviceQuirks.get(LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mImageProcessor = internalImageProcessor;
        this.mCameraCharacteristics = cameraCharacteristics;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }

    private Packet<byte[]> cropAndMaybeApplyEffect(Packet<byte[]> packet, int i2) {
        Preconditions.checkState(ImageUtil.isJpegFormats(packet.getFormat()));
        Packet<Bitmap> packetApply = this.mJpegBytes2CroppedBitmap.apply(packet);
        Operation<Packet<Bitmap>, Packet<Bitmap>> operation = this.mBitmapEffect;
        if (operation != null) {
            packetApply = operation.apply(packetApply);
        }
        return this.mBitmap2JpegBytes.apply(Bitmap2JpegBytes.In.of(packetApply, i2));
    }

    private ImageCapture.OutputFileResults saveJpegToDisk(Packet<ImageProxy> packet, ImageCapture.OutputFileOptions outputFileOptions, int i2) {
        Packet<byte[]> packetApply = this.mImage2JpegBytes.apply(Image2JpegBytes.In.of(packet, i2));
        if (packetApply.hasCropping() || this.mBitmapEffect != null) {
            packetApply = cropAndMaybeApplyEffect(packetApply, i2);
        }
        return this.mJpegBytes2Disk.apply(JpegBytes2Disk.In.of(packetApply, (ImageCapture.OutputFileOptions) Objects.requireNonNull(outputFileOptions)));
    }

    private ImageCapture.OutputFileResults saveRawToDisk(Packet<ImageProxy> packet, ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        DngImage2Disk dngImage2Disk = this.mDngImage2Disk;
        if (dngImage2Disk == null) {
            if (this.mCameraCharacteristics == null) {
                throw new ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (packet.getCameraCaptureResult().getCaptureResult() == null) {
                throw new ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            DngImage2Disk dngImage2Disk2 = new DngImage2Disk((CameraCharacteristics) Objects.requireNonNull(this.mCameraCharacteristics), (CaptureResult) Objects.requireNonNull(packet.getCameraCaptureResult().getCaptureResult()));
            this.mDngImage2Disk = dngImage2Disk2;
            dngImage2Disk = dngImage2Disk2;
        }
        return dngImage2Disk.apply(DngImage2Disk.In.of(packet.getData(), packet.getRotationDegrees(), (ImageCapture.OutputFileOptions) Objects.requireNonNull(outputFileOptions)));
    }

    private void sendError(final ProcessingRequest processingRequest, final ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                processingRequest.onProcessFailure(imageCaptureException);
            }
        });
    }

    void injectProcessingInput2Packet(Operation<InputPacket, Packet<ImageProxy>> operation) {
        this.mInput2Packet = operation;
    }

    /* renamed from: lambda$processInputPacket$6$androidx-camera-core-imagecapture-ProcessingNode, reason: not valid java name */
    /* synthetic */ void m1345x8525adbf(InputPacket inputPacket) {
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            int size = this.mInputEdge.getOutputFormats().size();
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                final ImageProxy imageProxyProcessInMemoryCapture = processInMemoryCapture(inputPacket);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        processingRequest.onFinalResult(imageProxyProcessInMemoryCapture);
                    }
                });
                return;
            }
            final ImageCapture.OutputFileResults outputFileResultsProcessOnDiskCapture = processOnDiskCapture(inputPacket);
            if (size > 1 && !processingRequest.getTakePictureRequest().isFormatProcessedInSimultaneousCapture()) {
                return;
            }
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    processingRequest.onFinalResult(outputFileResultsProcessOnDiskCapture);
                }
            });
        } catch (ImageCaptureException e2) {
            sendError(processingRequest, e2);
        } catch (OutOfMemoryError e3) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed due to low memory.", e3));
        } catch (RuntimeException e4) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed.", e4));
        }
    }

    /* renamed from: lambda$transform$1$androidx-camera-core-imagecapture-ProcessingNode, reason: not valid java name */
    /* synthetic */ void m1347xc5c546f5(final InputPacket inputPacket) {
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            this.mBlockingExecutor.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1346xd41ba0d6(inputPacket);
                }
            });
        }
    }

    /* renamed from: lambda$transform$3$androidx-camera-core-imagecapture-ProcessingNode, reason: not valid java name */
    /* synthetic */ void m1349xa9189333(final InputPacket inputPacket) {
        if (!inputPacket.getProcessingRequest().isAborted()) {
            this.mBlockingExecutor.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1348xb76eed14(inputPacket);
                }
            });
        } else {
            Logger.w(TAG, "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        }
    }

    ImageProxy processInMemoryCapture(InputPacket inputPacket) {
        Logger.d(TAG, "processInMemoryCapture: request ID = " + inputPacket.getProcessingRequest().getRequestId());
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        List<Integer> outputFormats = this.mInputEdge.getOutputFormats();
        Preconditions.checkArgument(!outputFormats.isEmpty());
        int iIntValue = outputFormats.get(0).intValue();
        if ((packetApply.getFormat() == 35 || this.mBitmapEffect != null || this.mHasIncorrectJpegMetadataQuirk) && iIntValue == 256) {
            Packet<byte[]> packetApply2 = this.mImage2JpegBytes.apply(Image2JpegBytes.In.of(packetApply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                packetApply2 = cropAndMaybeApplyEffect(packetApply2, processingRequest.getJpegQuality());
            }
            packetApply = this.mJpegBytes2Image.apply(packetApply2);
        }
        ImageProxy imageProxyApply = this.mJpegImage2Result.apply(packetApply);
        if (outputFormats.size() > 1) {
            processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(imageProxyApply.getFormat(), true);
        }
        return imageProxyApply;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: processInputPacket, reason: merged with bridge method [inline-methods] */
    public void m1346xd41ba0d6(final InputPacket inputPacket) {
        CameraXTracer.trace("processInputPacket", new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1345x8525adbf(inputPacket);
            }
        });
    }

    ImageCapture.OutputFileResults processOnDiskCapture(InputPacket inputPacket) throws ImageCaptureException {
        Logger.d(TAG, "processOnDiskCapture: request ID = " + inputPacket.getProcessingRequest().getRequestId());
        List<Integer> outputFormats = this.mInputEdge.getOutputFormats();
        Preconditions.checkArgument(outputFormats.isEmpty() ^ true);
        boolean z = false;
        Integer num = outputFormats.get(0);
        int iIntValue = num.intValue();
        Preconditions.checkArgument(ImageUtil.isJpegFormats(iIntValue) || ImageUtil.isRawFormats(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Preconditions.checkArgument(processingRequest.getOutputFileOptions() != null, "OutputFileOptions cannot be empty");
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        if (outputFormats.size() <= 1) {
            return iIntValue != 32 ? saveJpegToDisk(packetApply, (ImageCapture.OutputFileOptions) Objects.requireNonNull(processingRequest.getOutputFileOptions()), processingRequest.getJpegQuality()) : saveRawToDisk(packetApply, (ImageCapture.OutputFileOptions) Objects.requireNonNull(processingRequest.getOutputFileOptions()));
        }
        if (processingRequest.getOutputFileOptions() != null && processingRequest.getSecondaryOutputFileOptions() != null) {
            z = true;
        }
        Preconditions.checkArgument(z, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (packetApply.getFormat() != 32) {
            ImageCapture.OutputFileResults outputFileResultsSaveJpegToDisk = saveJpegToDisk(packetApply, (ImageCapture.OutputFileOptions) Objects.requireNonNull(processingRequest.getSecondaryOutputFileOptions()), processingRequest.getJpegQuality());
            processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(256, true);
            return outputFileResultsSaveJpegToDisk;
        }
        ImageCapture.OutputFileResults outputFileResultsSaveRawToDisk = saveRawToDisk(packetApply, (ImageCapture.OutputFileOptions) Objects.requireNonNull(processingRequest.getOutputFileOptions()));
        processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(32, true);
        return outputFileResultsSaveRawToDisk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: processPostviewInputPacket, reason: merged with bridge method [inline-methods] */
    public void m1348xb76eed14(InputPacket inputPacket) {
        boolean z;
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
            int format = packetApply.getFormat();
            if (format == 35 || format == 256) {
                z = true;
            } else if (format == 4101) {
                format = 4101;
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(format)));
            final Bitmap bitmapApply = this.mImage2Bitmap.apply(packetApply);
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    processingRequest.onPostviewBitmapAvailable(bitmapApply);
                }
            });
        } catch (Exception e2) {
            inputPacket.getImageProxy().close();
            Logger.e(TAG, "process postview input packet failed.", e2);
        }
    }

    @Override // androidx.camera.core.processing.Node
    public Void transform(In in) {
        this.mInputEdge = in;
        in.getEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.m1347xc5c546f5((ProcessingNode.InputPacket) obj);
            }
        });
        in.getPostviewEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.m1349xa9189333((ProcessingNode.InputPacket) obj);
            }
        });
        this.mInput2Packet = new ProcessingInput2Packet();
        this.mImage2JpegBytes = new Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new JpegBytes2Disk();
        this.mJpegImage2Result = new JpegImage2Result();
        this.mImage2Bitmap = new Image2Bitmap();
        if (in.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
            this.mJpegBytes2Image = new JpegBytes2Image();
        }
        InternalImageProcessor internalImageProcessor = this.mImageProcessor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.mBitmapEffect = new BitmapEffect(internalImageProcessor);
        return null;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }

    ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics, InternalImageProcessor internalImageProcessor) {
        this(executor, cameraCharacteristics, internalImageProcessor, DeviceQuirks.getAll());
    }

    ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this(executor, cameraCharacteristics, null, DeviceQuirks.getAll());
    }

    ProcessingNode(Executor executor, Quirks quirks, CameraCharacteristics cameraCharacteristics) {
        this(executor, cameraCharacteristics, null, quirks);
    }
}
