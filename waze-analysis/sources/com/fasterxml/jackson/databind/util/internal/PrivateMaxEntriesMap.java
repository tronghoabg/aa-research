package com.fasterxml.jackson.databind.util.internal;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.concurrent.ConcurrentMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PrivateMaxEntriesMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap<K, V> {
    static final long MAXIMUM_CAPACITY = 9223372034707292160L;
    static final int NCPU;
    static final int NUMBER_OF_READ_BUFFERS;
    static final int READ_BUFFERS_MASK;
    static final int READ_BUFFER_DRAIN_THRESHOLD = 8;
    static final int READ_BUFFER_INDEX_MASK = 15;
    static final int READ_BUFFER_SIZE = 16;
    static final int READ_BUFFER_THRESHOLD = 4;
    static final int WRITE_BUFFER_DRAIN_THRESHOLD = 16;
    static final long serialVersionUID = 1;
    final AtomicLong capacity;
    final int concurrencyLevel;
    final ConcurrentMap<K, Node<K, V>> data;
    final AtomicReference<DrainStatus> drainStatus;
    transient Set<Map.Entry<K, V>> entrySet;
    final LinkedDeque<Node<K, V>> evictionDeque;
    final Lock evictionLock;
    transient Set<K> keySet;
    final AtomicLongArray readBufferDrainAtWriteCount;
    final long[] readBufferReadCount;
    final AtomicLongArray readBufferWriteCount;
    final AtomicReferenceArray<Node<K, V>> readBuffers;
    transient Collection<V> values;
    final AtomicLong weightedSize;
    final Queue<Runnable> writeBuffer;

    /* compiled from: WazeSource */
    final class AddTask implements Runnable {
        final Node<K, V> node;
        final /* synthetic */ PrivateMaxEntriesMap this$0;
        final int weight;

        AddTask(PrivateMaxEntriesMap privateMaxEntriesMap, Node<K, V> node, int i2) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
            this.weight = i2;
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = this.this$0.weightedSize;
            atomicLong.lazySet(atomicLong.get() + this.weight);
            if (((WeightedValue) this.node.get()).isAlive()) {
                this.this$0.evictionDeque.add((LinkedDeque<Node<K, V>>) this.node);
                this.this$0.evict();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder<K, V> {
        static final int DEFAULT_CONCURRENCY_LEVEL = 16;
        static final int DEFAULT_INITIAL_CAPACITY = 16;
        long capacity = -1;
        int initialCapacity = 16;
        int concurrencyLevel = 16;

        public PrivateMaxEntriesMap<K, V> build() {
            PrivateMaxEntriesMap.checkState(this.capacity >= 0);
            return new PrivateMaxEntriesMap<>(this);
        }

        public Builder<K, V> concurrencyLevel(int i2) {
            PrivateMaxEntriesMap.checkArgument(i2 > 0);
            this.concurrencyLevel = i2;
            return this;
        }

        public Builder<K, V> initialCapacity(int i2) {
            PrivateMaxEntriesMap.checkArgument(i2 >= 0);
            this.initialCapacity = i2;
            return this;
        }

        public Builder<K, V> maximumCapacity(long j2) {
            PrivateMaxEntriesMap.checkArgument(j2 >= 0);
            this.capacity = j2;
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class EntryIterator implements Iterator<Map.Entry<K, V>> {
        Node<K, V> current;
        final Iterator<Node<K, V>> iterator;
        final /* synthetic */ PrivateMaxEntriesMap this$0;

        EntryIterator(PrivateMaxEntriesMap privateMaxEntriesMap) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
            this.iterator = privateMaxEntriesMap.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.current = this.iterator.next();
            return new WriteThroughEntry(this.this$0, this.current);
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            this.this$0.remove(this.current.key);
            this.current = null;
        }
    }

    /* compiled from: WazeSource */
    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        final PrivateMaxEntriesMap<K, V> map;
        final /* synthetic */ PrivateMaxEntriesMap this$0;

        EntrySet(PrivateMaxEntriesMap privateMaxEntriesMap) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
            this.map = privateMaxEntriesMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.map.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Node<K, V> node = this.map.data.get(entry.getKey());
            return node != null && node.getValue().equals(entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(this.this$0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.map.remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }
    }

    /* compiled from: WazeSource */
    final class KeyIterator implements Iterator<K> {
        K current;
        final Iterator<K> iterator;
        final /* synthetic */ PrivateMaxEntriesMap this$0;

        KeyIterator(PrivateMaxEntriesMap privateMaxEntriesMap) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
            this.iterator = privateMaxEntriesMap.data.keySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            K next = this.iterator.next();
            this.current = next;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            this.this$0.remove(this.current);
            this.current = null;
        }
    }

    /* compiled from: WazeSource */
    final class RemovalTask implements Runnable {
        final Node<K, V> node;
        final /* synthetic */ PrivateMaxEntriesMap this$0;

        RemovalTask(PrivateMaxEntriesMap privateMaxEntriesMap, Node<K, V> node) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.evictionDeque.remove((LinkedDeque<Node<K, V>>) this.node);
            this.this$0.makeDead(this.node);
        }
    }

    /* compiled from: WazeSource */
    final class SerializationProxy<K, V> implements Serializable {
        static final long serialVersionUID = 1;
        final long capacity;
        final int concurrencyLevel;
        final Map<K, V> data;

        SerializationProxy(PrivateMaxEntriesMap<K, V> privateMaxEntriesMap) {
            this.concurrencyLevel = privateMaxEntriesMap.concurrencyLevel;
            this.data = new HashMap(privateMaxEntriesMap);
            this.capacity = privateMaxEntriesMap.capacity.get();
        }

        Object readResolve() {
            Builder builder = new Builder();
            builder.maximumCapacity(this.capacity);
            PrivateMaxEntriesMap privateMaxEntriesMapBuild = builder.build();
            privateMaxEntriesMapBuild.putAll(this.data);
            return privateMaxEntriesMapBuild;
        }
    }

    /* compiled from: WazeSource */
    final class UpdateTask implements Runnable {
        final Node<K, V> node;
        final /* synthetic */ PrivateMaxEntriesMap this$0;
        final int weightDifference;

        UpdateTask(PrivateMaxEntriesMap privateMaxEntriesMap, Node<K, V> node, int i2) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
            this.weightDifference = i2;
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = this.this$0.weightedSize;
            atomicLong.lazySet(atomicLong.get() + this.weightDifference);
            this.this$0.applyRead(this.node);
            this.this$0.evict();
        }
    }

    /* compiled from: WazeSource */
    final class ValueIterator implements Iterator<V> {
        Node<K, V> current;
        final Iterator<Node<K, V>> iterator;
        final /* synthetic */ PrivateMaxEntriesMap this$0;

        ValueIterator(PrivateMaxEntriesMap privateMaxEntriesMap) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
            this.iterator = privateMaxEntriesMap.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            Node<K, V> next = this.iterator.next();
            this.current = next;
            return next.getValue();
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            this.this$0.remove(this.current.key);
            this.current = null;
        }
    }

    /* compiled from: WazeSource */
    final class Values extends AbstractCollection<V> {
        final /* synthetic */ PrivateMaxEntriesMap this$0;

        Values(PrivateMaxEntriesMap privateMaxEntriesMap) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.this$0.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(this.this$0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.this$0.size();
        }
    }

    /* compiled from: WazeSource */
    final class WeightedValue<V> {
        final V value;
        final int weight;

        WeightedValue(V v, int i2) {
            this.weight = i2;
            this.value = v;
        }

        boolean contains(Object obj) {
            V v = this.value;
            return obj == v || v.equals(obj);
        }

        boolean isAlive() {
            return this.weight > 0;
        }
    }

    /* compiled from: WazeSource */
    final class WriteThroughEntry extends AbstractMap.SimpleEntry<K, V> {
        static final long serialVersionUID = 1;
        final /* synthetic */ PrivateMaxEntriesMap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        WriteThroughEntry(PrivateMaxEntriesMap privateMaxEntriesMap, Node<K, V> node) {
            super(node.key, node.getValue());
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public V setValue(V v) {
            this.this$0.put(getKey(), v);
            return (V) super.setValue(v);
        }

        Object writeReplace() {
            return new AbstractMap.SimpleEntry(this);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        NCPU = iAvailableProcessors;
        int iMin = Math.min(4, ceilingNextPowerOfTwo(iAvailableProcessors));
        NUMBER_OF_READ_BUFFERS = iMin;
        READ_BUFFERS_MASK = iMin - 1;
    }

    PrivateMaxEntriesMap(Builder<K, V> builder) {
        int i2 = builder.concurrencyLevel;
        this.concurrencyLevel = i2;
        this.capacity = new AtomicLong(Math.min(builder.capacity, MAXIMUM_CAPACITY));
        this.data = new ConcurrentHashMap(builder.initialCapacity, 0.75f, i2);
        this.evictionLock = new ReentrantLock();
        this.weightedSize = new AtomicLong();
        this.evictionDeque = new LinkedDeque<>();
        this.writeBuffer = new ConcurrentLinkedQueue();
        this.drainStatus = new AtomicReference<>(DrainStatus.IDLE);
        int i3 = NUMBER_OF_READ_BUFFERS;
        this.readBufferReadCount = new long[i3];
        this.readBufferWriteCount = new AtomicLongArray(i3);
        this.readBufferDrainAtWriteCount = new AtomicLongArray(i3);
        this.readBuffers = new AtomicReferenceArray<>(i3 * 16);
    }

    static int ceilingNextPowerOfTwo(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }

    static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    static void checkNotNull(Object obj) {
        obj.getClass();
    }

    static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    static int readBufferIndex() {
        return ((int) Thread.currentThread().getId()) & READ_BUFFERS_MASK;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    void afterRead(Node<K, V> node) {
        int bufferIndex = readBufferIndex();
        drainOnReadIfNeeded(bufferIndex, recordRead(bufferIndex, node));
    }

    void afterWrite(Runnable runnable) {
        this.writeBuffer.add(runnable);
        this.drainStatus.lazySet(DrainStatus.REQUIRED);
        tryToDrainBuffers();
    }

    void applyRead(Node<K, V> node) {
        if (this.evictionDeque.contains((Linked<?>) node)) {
            this.evictionDeque.moveToBack(node);
        }
    }

    public long capacity() {
        return this.capacity.get();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.evictionLock.lock();
        while (true) {
            try {
                Node<K, V> node = (Node) this.evictionDeque.poll();
                if (node == null) {
                    break;
                }
                this.data.remove(node.key, node);
                makeDead(node);
            } finally {
                this.evictionLock.unlock();
            }
        }
        for (int i2 = 0; i2 < this.readBuffers.length(); i2++) {
            this.readBuffers.lazySet(i2, null);
        }
        while (true) {
            Runnable runnablePoll = this.writeBuffer.poll();
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.data.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        checkNotNull(obj);
        Iterator<Node<K, V>> it = this.data.values().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    void drainBuffers() {
        drainReadBuffers();
        drainWriteBuffer();
    }

    void drainOnReadIfNeeded(int i2, long j2) {
        if (this.drainStatus.get().shouldDrainBuffers(j2 - this.readBufferDrainAtWriteCount.get(i2) < 4)) {
            tryToDrainBuffers();
        }
    }

    void drainReadBuffer(int i2) {
        int bufferIndex;
        Node<K, V> node;
        long j2 = this.readBufferWriteCount.get(i2);
        for (int i3 = 0; i3 < 8 && (node = this.readBuffers.get((bufferIndex = readBufferIndex(i2, (int) (this.readBufferReadCount[i2] & 15))))) != null; i3++) {
            this.readBuffers.lazySet(bufferIndex, null);
            applyRead(node);
            long[] jArr = this.readBufferReadCount;
            jArr[i2] = jArr[i2] + 1;
        }
        this.readBufferDrainAtWriteCount.lazySet(i2, j2);
    }

    void drainReadBuffers() {
        int id = (int) Thread.currentThread().getId();
        int i2 = NUMBER_OF_READ_BUFFERS + id;
        while (id < i2) {
            drainReadBuffer(READ_BUFFERS_MASK & id);
            id++;
        }
    }

    void drainWriteBuffer() {
        Runnable runnablePoll;
        for (int i2 = 0; i2 < 16 && (runnablePoll = this.writeBuffer.poll()) != null; i2++) {
            runnablePoll.run();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet(this);
        this.entrySet = entrySet;
        return entrySet;
    }

    void evict() {
        Node<K, V> node;
        while (hasOverflowed() && (node = (Node) this.evictionDeque.poll()) != null) {
            this.data.remove(node.key, node);
            makeDead(node);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> node = this.data.get(obj);
        if (node == null) {
            return null;
        }
        afterRead(node);
        return node.getValue();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    boolean hasOverflowed() {
        return this.weightedSize.get() > this.capacity.get();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet(this);
        this.keySet = keySet;
        return keySet;
    }

    void makeDead(Node<K, V> node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, 0)));
        AtomicLong atomicLong = this.weightedSize;
        atomicLong.lazySet(atomicLong.get() - Math.abs(weightedValue.weight));
    }

    void makeRetired(Node<K, V> node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return;
            }
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, -weightedValue.weight)));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    V put(K k2, V v, boolean z) {
        WeightedValue weightedValue;
        checkNotNull(k2);
        checkNotNull(v);
        WeightedValue weightedValue2 = new WeightedValue(v, 1);
        Node<K, V> node = new Node<>(k2, weightedValue2);
        while (true) {
            Node<K, V> nodePutIfAbsent = this.data.putIfAbsent(node.key, node);
            if (nodePutIfAbsent == null) {
                afterWrite(new AddTask(this, node, 1));
                return null;
            }
            if (z) {
                afterRead(nodePutIfAbsent);
                return nodePutIfAbsent.getValue();
            }
            do {
                weightedValue = (WeightedValue) nodePutIfAbsent.get();
                if (weightedValue.isAlive()) {
                }
            } while (!nodePutIfAbsent.compareAndSet(weightedValue, weightedValue2));
            int i2 = 1 - weightedValue.weight;
            if (i2 == 0) {
                afterRead(nodePutIfAbsent);
            } else {
                afterWrite(new UpdateTask(this, nodePutIfAbsent, i2));
            }
            return weightedValue.value;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return put(k2, v, true);
    }

    long recordRead(int i2, Node<K, V> node) {
        long j2 = this.readBufferWriteCount.get(i2);
        this.readBufferWriteCount.lazySet(i2, 1 + j2);
        this.readBuffers.lazySet(readBufferIndex(i2, (int) (15 & j2)), node);
        return j2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        Node<K, V> node = this.data.get(obj);
        if (node == null || obj2 == null) {
            return false;
        }
        WeightedValue<V> weightedValue = (WeightedValue) node.get();
        while (weightedValue.contains(obj2)) {
            if (tryToRetire(node, weightedValue)) {
                if (!this.data.remove(obj, node)) {
                    return false;
                }
                afterWrite(new RemovalTask(this, node));
                return true;
            }
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return false;
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(K k2, V v, V v2) {
        WeightedValue weightedValue;
        checkNotNull(k2);
        checkNotNull(v);
        checkNotNull(v2);
        WeightedValue weightedValue2 = new WeightedValue(v2, 1);
        Node<K, V> node = this.data.get(k2);
        if (node != null) {
            do {
                weightedValue = (WeightedValue) node.get();
                if (!weightedValue.isAlive() || !weightedValue.contains(v)) {
                }
            } while (!node.compareAndSet(weightedValue, weightedValue2));
            int i2 = 1 - weightedValue.weight;
            if (i2 == 0) {
                afterRead(node);
            } else {
                afterWrite(new UpdateTask(this, node, i2));
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    public void setCapacity(long j2) {
        checkArgument(j2 >= 0);
        this.evictionLock.lock();
        try {
            this.capacity.lazySet(Math.min(j2, MAXIMUM_CAPACITY));
            drainBuffers();
            evict();
        } finally {
            this.evictionLock.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.data.size();
    }

    void tryToDrainBuffers() {
        if (this.evictionLock.tryLock()) {
            try {
                this.drainStatus.lazySet(DrainStatus.PROCESSING);
                drainBuffers();
            } finally {
                PrivateMaxEntriesMap$$ExternalSyntheticBackportWithForwarding0.m(this.drainStatus, DrainStatus.PROCESSING, DrainStatus.IDLE);
                this.evictionLock.unlock();
            }
        }
    }

    boolean tryToRetire(Node<K, V> node, WeightedValue<V> weightedValue) {
        if (weightedValue.isAlive()) {
            return node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, -weightedValue.weight));
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values(this);
        this.values = values;
        return values;
    }

    Object writeReplace() {
        return new SerializationProxy(this);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    abstract class DrainStatus {
        private static final /* synthetic */ DrainStatus[] $VALUES = $values();
        public static final DrainStatus IDLE;
        public static final DrainStatus PROCESSING;
        public static final DrainStatus REQUIRED;

        /* compiled from: WazeSource */
        /* renamed from: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$DrainStatus$1, reason: invalid class name */
        enum AnonymousClass1 extends DrainStatus {
            private AnonymousClass1(String str, int i2) {
                super(str, i2);
            }

            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            boolean shouldDrainBuffers(boolean z) {
                return !z;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$DrainStatus$2, reason: invalid class name */
        enum AnonymousClass2 extends DrainStatus {
            private AnonymousClass2(String str, int i2) {
                super(str, i2);
            }

            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            boolean shouldDrainBuffers(boolean z) {
                return true;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$DrainStatus$3, reason: invalid class name */
        enum AnonymousClass3 extends DrainStatus {
            private AnonymousClass3(String str, int i2) {
                super(str, i2);
            }

            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            boolean shouldDrainBuffers(boolean z) {
                return false;
            }
        }

        private static /* synthetic */ DrainStatus[] $values() {
            return new DrainStatus[]{IDLE, REQUIRED, PROCESSING};
        }

        static {
            IDLE = new AnonymousClass1("IDLE", 0);
            REQUIRED = new AnonymousClass2("REQUIRED", 1);
            PROCESSING = new AnonymousClass3("PROCESSING", 2);
        }

        public static DrainStatus valueOf(String str) {
            return (DrainStatus) Enum.valueOf(DrainStatus.class, str);
        }

        public static DrainStatus[] values() {
            return (DrainStatus[]) $VALUES.clone();
        }

        abstract boolean shouldDrainBuffers(boolean z);

        private DrainStatus(String str, int i2) {
        }
    }

    /* compiled from: WazeSource */
    final class Node<K, V> extends AtomicReference<WeightedValue<V>> implements Linked<Node<K, V>> {
        final K key;
        Node<K, V> next;
        Node<K, V> prev;

        Node(K k2, WeightedValue<V> weightedValue) {
            super(weightedValue);
            this.key = k2;
        }

        V getValue() {
            return ((WeightedValue) get()).value;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public Node<K, V> getNext() {
            return this.next;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public Node<K, V> getPrevious() {
            return this.prev;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public void setNext(Node<K, V> node) {
            this.next = node;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public void setPrevious(Node<K, V> node) {
            this.prev = node;
        }
    }

    /* compiled from: WazeSource */
    final class KeySet extends AbstractSet<K> {
        final PrivateMaxEntriesMap<K, V> map;
        final /* synthetic */ PrivateMaxEntriesMap this$0;

        KeySet(PrivateMaxEntriesMap privateMaxEntriesMap) {
            Objects.requireNonNull(privateMaxEntriesMap);
            this.this$0 = privateMaxEntriesMap;
            this.map = privateMaxEntriesMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.map.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.this$0.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator(this.this$0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return this.map.data.keySet().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.map.data.keySet().toArray(tArr);
        }
    }

    private static int readBufferIndex(int i2, int i3) {
        return (i2 * 16) + i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> nodeRemove = this.data.remove(obj);
        if (nodeRemove == null) {
            return null;
        }
        makeRetired(nodeRemove);
        afterWrite(new RemovalTask(this, nodeRemove));
        return nodeRemove.getValue();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V replace(K k2, V v) {
        WeightedValue weightedValue;
        checkNotNull(k2);
        checkNotNull(v);
        WeightedValue weightedValue2 = new WeightedValue(v, 1);
        Node<K, V> node = this.data.get(k2);
        if (node == null) {
            return null;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return null;
            }
        } while (!node.compareAndSet(weightedValue, weightedValue2));
        int i2 = 1 - weightedValue.weight;
        if (i2 == 0) {
            afterRead(node);
        } else {
            afterWrite(new UpdateTask(this, node, i2));
        }
        return weightedValue.value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return put(k2, v, false);
    }
}
