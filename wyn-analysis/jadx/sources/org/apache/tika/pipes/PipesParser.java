package org.apache.tika.pipes;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class PipesParser implements Closeable {
    private final ArrayBlockingQueue<PipesClient> clientQueue;
    private final List<PipesClient> clients = new ArrayList();
    private final PipesConfig pipesConfig;

    public PipesParser(PipesConfig pipesConfig) {
        this.pipesConfig = pipesConfig;
        this.clientQueue = new ArrayBlockingQueue<>(pipesConfig.getNumClients());
        for (int i5 = 0; i5 < pipesConfig.getNumClients(); i5++) {
            PipesClient pipesClient = new PipesClient(pipesConfig);
            this.clientQueue.offer(pipesClient);
            this.clients.add(pipesClient);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator<PipesClient> it = this.clients.iterator();
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException e7) {
                arrayList.add(e7);
            }
        }
        if (arrayList.size() > 0) {
            throw ((IOException) arrayList.get(0));
        }
    }

    public PipesResult parse(FetchEmitTuple fetchEmitTuple) throws Throwable {
        PipesClient pipesClientPoll;
        PipesResult pipesResultProcess;
        PipesClient pipesClient = null;
        try {
            pipesClientPoll = this.clientQueue.poll(this.pipesConfig.getMaxWaitForClientMillis(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (pipesClientPoll == null) {
                pipesResultProcess = PipesResult.CLIENT_UNAVAILABLE_WITHIN_MS;
                if (pipesClientPoll != null) {
                }
                return pipesResultProcess;
            }
            pipesResultProcess = pipesClientPoll.process(fetchEmitTuple);
            this.clientQueue.offer(pipesClientPoll);
            return pipesResultProcess;
        } catch (Throwable th2) {
            th = th2;
            pipesClient = pipesClientPoll;
            if (pipesClient != null) {
                this.clientQueue.offer(pipesClient);
            }
            throw th;
        }
    }
}
