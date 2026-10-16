.class public abstract Lw9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Lcom/applovin/impl/T0;

.field public static final c:Lp2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    sput-object v0, Lw9/k;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v0, Lcom/applovin/impl/T0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lcom/applovin/impl/T0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 12
    .line 13
    new-instance v0, Lp2/a;

    .line 14
    .line 15
    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    invoke-direct {v0}, Lp2/a;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lw9/k;->c:Lp2/a;

    .line 21
    .line 22
    return-void
.end method
