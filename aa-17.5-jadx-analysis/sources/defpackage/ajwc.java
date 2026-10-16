package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class ajwc implements Serializable, ajqw {
    private static final long serialVersionUID = -7581093305228232025L;
    private final TreeSet a = new TreeSet(new ajuk());
    private transient ReadWriteLock b = new ReentrantReadWriteLock();

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.b = new ReentrantReadWriteLock();
    }

    @Override // defpackage.ajqw
    public final List a() {
        this.b.readLock().lock();
        try {
            return new ArrayList(this.a);
        } finally {
            this.b.readLock().unlock();
        }
    }

    @Override // defpackage.ajqw
    public final void b(ajui ajuiVar) {
        if (ajuiVar != null) {
            this.b.writeLock().lock();
            try {
                TreeSet treeSet = this.a;
                treeSet.remove(ajuiVar);
                if (!ajuiVar.g(new Date())) {
                    treeSet.add(ajuiVar);
                }
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    @Override // defpackage.ajqw
    public final void c(Date date) {
        this.b.writeLock().lock();
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                if (((ajui) it.next()).g(date)) {
                    it.remove();
                }
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }

    public final String toString() {
        this.b.readLock().lock();
        try {
            return this.a.toString();
        } finally {
            this.b.readLock().unlock();
        }
    }
}
