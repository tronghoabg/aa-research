.class public final Lod/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lod/A0;->a:I

    iput-object p1, p0, Lod/A0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget p1, p0, Lod/A0;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lod/A0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lyc/g;

    .line 9
    .line 10
    iget-object p1, p1, Lyc/g;->h:Lmd/J;

    .line 11
    .line 12
    const-string p2, "Failed to process frames after camera was flipped."

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lmd/J;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    sget-object p1, Lod/M0;->d0:Ljava/util/logging/Logger;

    .line 19
    .line 20
    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "["

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lod/A0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lod/M0;

    .line 32
    .line 33
    iget-object v3, v2, Lod/M0;->a:Lmd/F;

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, "] Uncaught exception in the SynchronizationContext. Panic!"

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p1, v0, v1, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    iget-boolean p1, v2, Lod/M0;->z:Z

    .line 51
    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, v2, Lod/M0;->z:Z

    .line 57
    .line 58
    invoke-virtual {v2, p1}, Lod/M0;->r(Z)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-virtual {v2, p1}, Lod/M0;->w(Z)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lod/z0;

    .line 66
    .line 67
    invoke-direct {p1, p2}, Lod/z0;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, v2, Lod/M0;->y:Lmd/M;

    .line 71
    .line 72
    iget-object p2, v2, Lod/M0;->E:Lod/H;

    .line 73
    .line 74
    invoke-virtual {p2, p1}, Lod/H;->i(Lmd/M;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, v2, Lod/M0;->Q:Lod/J0;

    .line 78
    .line 79
    const/4 p2, 0x0

    .line 80
    invoke-virtual {p1, p2}, Lod/J0;->j(Lmd/D;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, v2, Lod/M0;->O:Lod/k;

    .line 84
    .line 85
    const/4 p2, 0x4

    .line 86
    const-string v0, "PANIC! Entering TRANSIENT_FAILURE"

    .line 87
    .line 88
    invoke-virtual {p1, p2, v0}, Lod/k;->g(ILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lmd/m;->c:Lmd/m;

    .line 92
    .line 93
    iget-object p2, v2, Lod/M0;->r:Ld7/j;

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Ld7/j;->d(Lmd/m;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
