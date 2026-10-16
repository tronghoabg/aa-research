.class public final LFd/f;
.super LRd/d;
.source "SourceFile"


# static fields
.field public static final g:LD8/a;

.field public static final h:LD8/a;

.field public static final i:LD8/a;

.field public static final j:LD8/a;

.field public static final k:LD8/a;

.field public static final l:LD8/a;

.field public static final m:LD8/a;

.field public static final n:LD8/a;

.field public static final o:LD8/a;

.field public static final p:LD8/a;


# instance fields
.field public final synthetic e:I

.field public final f:Z


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD8/a;

    .line 2
    .line 3
    const-string v1, "Before"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LFd/f;->g:LD8/a;

    .line 10
    .line 11
    new-instance v0, LD8/a;

    .line 12
    .line 13
    const-string v1, "State"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, LFd/f;->h:LD8/a;

    .line 19
    .line 20
    new-instance v0, LD8/a;

    .line 21
    .line 22
    const-string v1, "Transform"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LFd/f;->i:LD8/a;

    .line 28
    .line 29
    new-instance v0, LD8/a;

    .line 30
    .line 31
    const-string v1, "Render"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, LFd/f;->j:LD8/a;

    .line 37
    .line 38
    new-instance v0, LD8/a;

    .line 39
    .line 40
    const-string v1, "Send"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, LFd/f;->k:LD8/a;

    .line 46
    .line 47
    new-instance v0, LD8/a;

    .line 48
    .line 49
    const-string v1, "Before"

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, LFd/f;->l:LD8/a;

    .line 56
    .line 57
    new-instance v0, LD8/a;

    .line 58
    .line 59
    const-string v1, "State"

    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    sput-object v0, LFd/f;->m:LD8/a;

    .line 65
    .line 66
    new-instance v0, LD8/a;

    .line 67
    .line 68
    const-string v1, "Monitoring"

    .line 69
    .line 70
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 71
    .line 72
    .line 73
    sput-object v0, LFd/f;->n:LD8/a;

    .line 74
    .line 75
    new-instance v0, LD8/a;

    .line 76
    .line 77
    const-string v1, "Engine"

    .line 78
    .line 79
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    sput-object v0, LFd/f;->o:LD8/a;

    .line 83
    .line 84
    new-instance v0, LD8/a;

    .line 85
    .line 86
    const-string v1, "Receive"

    .line 87
    .line 88
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    sput-object v0, LFd/f;->p:LD8/a;

    .line 92
    .line 93
    return-void
.end method

.method public constructor <init>(I)V
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x5

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x1

    .line 7
    iput p1, p0, LFd/f;->e:I

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-array p1, v3, [LD8/a;

    .line 13
    .line 14
    sget-object v3, LFd/f;->g:LD8/a;

    .line 15
    .line 16
    aput-object v3, p1, v4

    .line 17
    .line 18
    sget-object v3, LFd/f;->h:LD8/a;

    .line 19
    .line 20
    aput-object v3, p1, v5

    .line 21
    .line 22
    sget-object v3, LFd/f;->i:LD8/a;

    .line 23
    .line 24
    aput-object v3, p1, v2

    .line 25
    .line 26
    sget-object v2, LFd/f;->j:LD8/a;

    .line 27
    .line 28
    aput-object v2, p1, v1

    .line 29
    .line 30
    sget-object v1, LFd/f;->k:LD8/a;

    .line 31
    .line 32
    aput-object v1, p1, v0

    .line 33
    .line 34
    invoke-direct {p0, p1}, LRd/d;-><init>([LD8/a;)V

    .line 35
    .line 36
    .line 37
    iput-boolean v5, p0, LFd/f;->f:Z

    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    new-array p1, v3, [LD8/a;

    .line 41
    .line 42
    sget-object v3, LFd/f;->l:LD8/a;

    .line 43
    .line 44
    aput-object v3, p1, v4

    .line 45
    .line 46
    sget-object v3, LFd/f;->m:LD8/a;

    .line 47
    .line 48
    aput-object v3, p1, v5

    .line 49
    .line 50
    sget-object v3, LFd/f;->n:LD8/a;

    .line 51
    .line 52
    aput-object v3, p1, v2

    .line 53
    .line 54
    sget-object v2, LFd/f;->o:LD8/a;

    .line 55
    .line 56
    aput-object v2, p1, v1

    .line 57
    .line 58
    sget-object v1, LFd/f;->p:LD8/a;

    .line 59
    .line 60
    aput-object v1, p1, v0

    .line 61
    .line 62
    invoke-direct {p0, p1}, LRd/d;-><init>([LD8/a;)V

    .line 63
    .line 64
    .line 65
    iput-boolean v5, p0, LFd/f;->f:Z

    .line 66
    .line 67
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final d()Z
    .locals 1

    .line 1
    iget v0, p0, LFd/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LFd/f;->f:Z

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget-boolean v0, p0, LFd/f;->f:Z

    .line 10
    .line 11
    return v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
