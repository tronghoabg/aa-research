.class public final LGd/b;
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
    sput-object v0, LGd/b;->g:LD8/a;

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
    sput-object v0, LGd/b;->h:LD8/a;

    .line 19
    .line 20
    new-instance v0, LD8/a;

    .line 21
    .line 22
    const-string v1, "After"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LGd/b;->i:LD8/a;

    .line 28
    .line 29
    new-instance v0, LD8/a;

    .line 30
    .line 31
    const-string v1, "Receive"

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, LGd/b;->j:LD8/a;

    .line 38
    .line 39
    new-instance v0, LD8/a;

    .line 40
    .line 41
    const-string v1, "Parse"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    sput-object v0, LGd/b;->k:LD8/a;

    .line 47
    .line 48
    new-instance v0, LD8/a;

    .line 49
    .line 50
    const-string v1, "Transform"

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, LGd/b;->l:LD8/a;

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
    sput-object v0, LGd/b;->m:LD8/a;

    .line 65
    .line 66
    new-instance v0, LD8/a;

    .line 67
    .line 68
    const-string v1, "After"

    .line 69
    .line 70
    invoke-direct {v0, v1, v2}, LD8/a;-><init>(Ljava/lang/String;I)V

    .line 71
    .line 72
    .line 73
    sput-object v0, LGd/b;->n:LD8/a;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(I)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    iput p1, p0, LGd/b;->e:I

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-array p1, v1, [LD8/a;

    .line 11
    .line 12
    sget-object v1, LGd/b;->g:LD8/a;

    .line 13
    .line 14
    aput-object v1, p1, v2

    .line 15
    .line 16
    sget-object v1, LGd/b;->h:LD8/a;

    .line 17
    .line 18
    aput-object v1, p1, v3

    .line 19
    .line 20
    sget-object v1, LGd/b;->i:LD8/a;

    .line 21
    .line 22
    aput-object v1, p1, v0

    .line 23
    .line 24
    invoke-direct {p0, p1}, LRd/d;-><init>([LD8/a;)V

    .line 25
    .line 26
    .line 27
    iput-boolean v3, p0, LGd/b;->f:Z

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    const/4 p1, 0x5

    .line 31
    new-array p1, p1, [LD8/a;

    .line 32
    .line 33
    sget-object v4, LGd/b;->j:LD8/a;

    .line 34
    .line 35
    aput-object v4, p1, v2

    .line 36
    .line 37
    sget-object v2, LGd/b;->k:LD8/a;

    .line 38
    .line 39
    aput-object v2, p1, v3

    .line 40
    .line 41
    sget-object v2, LGd/b;->l:LD8/a;

    .line 42
    .line 43
    aput-object v2, p1, v0

    .line 44
    .line 45
    sget-object v0, LGd/b;->m:LD8/a;

    .line 46
    .line 47
    aput-object v0, p1, v1

    .line 48
    .line 49
    sget-object v0, LGd/b;->n:LD8/a;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    aput-object v0, p1, v1

    .line 53
    .line 54
    invoke-direct {p0, p1}, LRd/d;-><init>([LD8/a;)V

    .line 55
    .line 56
    .line 57
    iput-boolean v3, p0, LGd/b;->f:Z

    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final d()Z
    .locals 1

    .line 1
    iget v0, p0, LGd/b;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LGd/b;->f:Z

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget-boolean v0, p0, LGd/b;->f:Z

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
