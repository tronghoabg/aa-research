package org.apache.tika.pipes.async;

import G8.c;
import cb.AbstractC1593a;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.tika.exception.TikaException;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.PipesClient;
import org.apache.tika.pipes.PipesException;
import org.apache.tika.pipes.PipesReporter;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import org.apache.tika.pipes.pipesiterator.TotalCounter;
import vg.b;
import vg.d;

/* loaded from: classes5.dex */
public class AsyncProcessor implements Closeable {
    private static final b LOG = d.b(AsyncProcessor.class);
    private static long MAX_OFFER_WAIT_MS = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    static final int PARSER_FUTURE_CODE = 1;
    static final int WATCHER_FUTURE_CODE = 3;
    private boolean addedEmitterSemaphores;
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue<EmitData> emitData;
    private final ExecutorCompletionService<Integer> executorCompletionService;
    private final ExecutorService executorService;
    private final ArrayBlockingQueue<FetchEmitTuple> fetchEmitTuples;
    boolean isShuttingDown;
    private volatile int numEmitterThreadsFinished;
    private volatile int numParserThreadsFinished;
    private final AtomicLong totalProcessed;

    public class FetchEmitWorker implements Callable<Integer> {
        private final AsyncConfig asyncConfig;
        private final ArrayBlockingQueue<EmitData> emitDataQueue;
        private final ArrayBlockingQueue<FetchEmitTuple> fetchEmitTuples;

        public /* synthetic */ FetchEmitWorker(AsyncProcessor asyncProcessor, AsyncConfig asyncConfig, ArrayBlockingQueue arrayBlockingQueue, ArrayBlockingQueue arrayBlockingQueue2, int i5) {
            this(asyncConfig, arrayBlockingQueue, arrayBlockingQueue2);
        }

        private boolean shouldEmit(PipesResult pipesResult) {
            if (pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS || pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS_WITH_EXCEPTION) {
                return true;
            }
            return pipesResult.isIntermediate() && this.asyncConfig.isEmitIntermediateResults();
        }

        private FetchEmitWorker(AsyncConfig asyncConfig, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue, ArrayBlockingQueue<EmitData> arrayBlockingQueue2) {
            this.asyncConfig = asyncConfig;
            this.fetchEmitTuples = arrayBlockingQueue;
            this.emitDataQueue = arrayBlockingQueue2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Integer call() throws Exception {
            PipesResult pipesResultProcess;
            PipesClient pipesClient = new PipesClient(this.asyncConfig);
            while (true) {
                try {
                    FetchEmitTuple fetchEmitTuplePoll = this.fetchEmitTuples.poll(1L, TimeUnit.SECONDS);
                    if (fetchEmitTuplePoll == null) {
                        if (AsyncProcessor.LOG.e()) {
                            AsyncProcessor.LOG.s("null fetch emit tuple");
                        }
                    } else {
                        if (fetchEmitTuplePoll == PipesIterator.COMPLETED_SEMAPHORE) {
                            if (AsyncProcessor.LOG.e()) {
                                AsyncProcessor.LOG.s("hit completed semaphore");
                            }
                            pipesClient.close();
                            return 1;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            pipesResultProcess = pipesClient.process(fetchEmitTuplePoll);
                        } catch (IOException e7) {
                            AsyncProcessor.LOG.h("pipesClient crash", e7);
                            pipesResultProcess = PipesResult.UNSPECIFIED_CRASH;
                        }
                        if (AsyncProcessor.LOG.e()) {
                            AsyncProcessor.LOG.l("timer -- pipes client process: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (shouldEmit(pipesResultProcess)) {
                            AsyncProcessor.LOG.s("adding result to emitter queue: " + pipesResultProcess.getEmitData());
                            if (!this.emitDataQueue.offer(pipesResultProcess.getEmitData(), AsyncProcessor.MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                                throw new RuntimeException("Couldn't offer emit data to queue within " + AsyncProcessor.MAX_OFFER_WAIT_MS + " ms");
                            }
                        }
                        if (AsyncProcessor.LOG.e()) {
                            AsyncProcessor.LOG.l("timer -- offered: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                        }
                        this.asyncConfig.getPipesReporter().report(fetchEmitTuplePoll, pipesResultProcess, System.currentTimeMillis() - jCurrentTimeMillis);
                        AsyncProcessor.this.totalProcessed.incrementAndGet();
                    }
                } catch (Throwable th) {
                    try {
                        pipesClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public AsyncProcessor(Path path) throws TikaException, IOException {
        this(path, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$new$0() throws Exception {
        while (true) {
            try {
                Thread.sleep(500L);
                checkActive();
            } catch (InterruptedException unused) {
                return 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCounter$1(TotalCounter totalCounter) throws InterruptedException {
        totalCounter.startTotalCount();
        PipesReporter pipesReporter = this.asyncConfig.getPipesReporter();
        TotalCountResult.STATUS status = totalCounter.getTotalCount().getStatus();
        while (status == TotalCountResult.STATUS.NOT_COMPLETED) {
            try {
                Thread.sleep(500L);
                TotalCountResult totalCount = totalCounter.getTotalCount();
                LOG.f("counter total  {} {} ", totalCount.getStatus(), Long.valueOf(totalCount.getTotalCount()));
                pipesReporter.report(totalCount);
                status = totalCount.getStatus();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private void startCounter(TotalCounter totalCounter) {
        Thread thread = new Thread(new ng.a(2, this, totalCounter));
        thread.setDaemon(true);
        thread.start();
    }

    public synchronized boolean checkActive() throws InterruptedException {
        boolean z2;
        try {
            Future<Integer> futurePoll = this.executorCompletionService.poll();
            z2 = true;
            if (futurePoll != null) {
                try {
                    Integer num = futurePoll.get();
                    int iIntValue = num.intValue();
                    if (iIntValue == 1) {
                        this.numParserThreadsFinished++;
                        LOG.u(Integer.valueOf(this.numParserThreadsFinished), "fetchEmitWorker finished, total {}");
                    } else if (iIntValue == 2) {
                        this.numEmitterThreadsFinished++;
                        LOG.u(Integer.valueOf(this.numEmitterThreadsFinished), "emitter thread finished, total {}");
                    } else {
                        if (iIntValue != 3) {
                            throw new IllegalArgumentException("Don't recognize this future code: " + num);
                        }
                        LOG.debug("watcher thread finished");
                    }
                } catch (ExecutionException e7) {
                    LOG.error("execution exception", e7);
                    this.asyncConfig.getPipesReporter().error(e7);
                    throw new RuntimeException(e7);
                }
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && !this.addedEmitterSemaphores) {
                for (int i5 = 0; i5 < this.asyncConfig.getNumEmitters(); i5++) {
                    try {
                        if (!this.emitData.offer(AsyncEmitter.EMIT_DATA_STOP_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                            throw new RuntimeException("Couldn't offer emit data stop semaphore within " + MAX_OFFER_WAIT_MS + " ms");
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                this.addedEmitterSemaphores = true;
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && this.numEmitterThreadsFinished == this.asyncConfig.getNumEmitters()) {
                z2 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.executorService.shutdownNow();
        this.asyncConfig.getPipesReporter().close();
    }

    public void finished() throws InterruptedException {
        for (int i5 = 0; i5 < this.asyncConfig.getNumClients(); i5++) {
            if (!this.fetchEmitTuples.offer(PipesIterator.COMPLETED_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException(AbstractC1593a.h(MAX_OFFER_WAIT_MS, "Couldn't offer completed semaphore within ", " ms"));
            }
        }
    }

    public int getCapacity() {
        return this.fetchEmitTuples.remainingCapacity();
    }

    public long getTotalProcessed() {
        return this.totalProcessed.get();
    }

    public synchronized boolean offer(List<FetchEmitTuple> list, long j8) throws PipesException, InterruptedException {
        if (this.isShuttingDown) {
            throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
        }
        if (list.size() > this.asyncConfig.getQueueSize()) {
            throw new OfferLargerThanQueueSize(list.size(), this.asyncConfig.getQueueSize());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (long jCurrentTimeMillis2 = System.currentTimeMillis(); jCurrentTimeMillis2 - jCurrentTimeMillis < j8; jCurrentTimeMillis2 = System.currentTimeMillis()) {
            if (this.fetchEmitTuples.remainingCapacity() > list.size()) {
                try {
                    this.fetchEmitTuples.addAll(list);
                    return true;
                } catch (IllegalStateException e7) {
                    LOG.r("couldn't add full list", e7);
                }
            }
            Thread.sleep(100L);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncProcessor(Path path, PipesIterator pipesIterator) throws Exception {
        AsyncProcessor asyncProcessor;
        Exception exc;
        this.totalProcessed = new AtomicLong(0L);
        this.numParserThreadsFinished = 0;
        this.numEmitterThreadsFinished = 0;
        this.addedEmitterSemaphores = false;
        this.isShuttingDown = false;
        AsyncConfig asyncConfigLoad = AsyncConfig.load(path);
        this.asyncConfig = asyncConfigLoad;
        this.fetchEmitTuples = new ArrayBlockingQueue<>(asyncConfigLoad.getQueueSize());
        this.emitData = new ArrayBlockingQueue<>(100);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(asyncConfigLoad.getNumEmitters() + asyncConfigLoad.getNumClients() + 1);
        this.executorService = executorServiceNewFixedThreadPool;
        ExecutorCompletionService<Integer> executorCompletionService = new ExecutorCompletionService<>(executorServiceNewFixedThreadPool);
        this.executorCompletionService = executorCompletionService;
        try {
            if (!path.toAbsolutePath().equals(asyncConfigLoad.getTikaConfig().toAbsolutePath())) {
                try {
                    LOG.j(path.toAbsolutePath(), "TikaConfig for AsyncProcessor ({}) is different from TikaConfig for workers ({}). If this is intended, please ignore this warning.", asyncConfigLoad.getTikaConfig().toAbsolutePath());
                } catch (Exception e7) {
                    exc = e7;
                    asyncProcessor = this;
                    LOG.error("problem initializing AsyncProcessor", exc);
                    asyncProcessor.executorService.shutdownNow();
                    asyncProcessor.asyncConfig.getPipesReporter().error(exc);
                    throw exc;
                }
            }
            executorCompletionService.submit(new c(this, 10));
            if (pipesIterator != 0 && (pipesIterator instanceof TotalCounter)) {
                LOG.debug("going to total counts");
                startCounter((TotalCounter) pipesIterator);
            }
            for (int i5 = 0; i5 < this.asyncConfig.getNumClients(); i5++) {
                asyncProcessor = this;
                try {
                    this.executorCompletionService.submit(new FetchEmitWorker(asyncProcessor, this.asyncConfig, this.fetchEmitTuples, this.emitData, 0));
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    LOG.error("problem initializing AsyncProcessor", exc);
                    asyncProcessor.executorService.shutdownNow();
                    asyncProcessor.asyncConfig.getPipesReporter().error(exc);
                    throw exc;
                }
            }
            asyncProcessor = this;
            EmitterManager emitterManagerLoad = EmitterManager.load(asyncProcessor.asyncConfig.getTikaConfig());
            for (int i10 = 0; i10 < asyncProcessor.asyncConfig.getNumEmitters(); i10++) {
                asyncProcessor.executorCompletionService.submit(new AsyncEmitter(asyncProcessor.asyncConfig, asyncProcessor.emitData, emitterManagerLoad));
            }
        } catch (Exception e11) {
            e = e11;
            asyncProcessor = this;
        }
    }

    public synchronized boolean offer(FetchEmitTuple fetchEmitTuple, long j8) throws PipesException, InterruptedException {
        if (this.fetchEmitTuples != null) {
            if (!this.isShuttingDown) {
                checkActive();
            } else {
                throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
            }
        } else {
            throw new IllegalStateException("queue hasn't been initialized yet.");
        }
        return this.fetchEmitTuples.offer(fetchEmitTuple, j8, TimeUnit.MILLISECONDS);
    }
}
