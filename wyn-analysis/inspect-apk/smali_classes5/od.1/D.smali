.class public final Lod/D;
.super LT3/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:Lmd/e;

.field public final e:Lmd/k0;


# direct methods
.method public constructor <init>(Lod/C0;Lmd/e;Lmd/k0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lod/D;->c:I

    .line 5
    iput-object p2, p0, Lod/D;->d:Lmd/e;

    iput-object p3, p0, Lod/D;->e:Lmd/k0;

    .line 6
    iget-object p1, p1, Lod/C0;->e:Lmd/q;

    const/4 p2, 0x1

    .line 7
    invoke-direct {p0, p1, p2}, LT3/d;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lod/I0;Lmd/e;Lmd/k0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lod/D;->c:I

    .line 1
    iget-object p1, p1, Lod/I0;->c:Lmd/q;

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, LT3/d;-><init>(Ljava/lang/Object;I)V

    .line 3
    iput-object p2, p0, Lod/D;->d:Lmd/e;

    .line 4
    iput-object p3, p0, Lod/D;->e:Lmd/k0;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Lod/D;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lmd/b0;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lod/D;->d:Lmd/e;

    .line 12
    .line 13
    iget-object v2, p0, Lod/D;->e:Lmd/k0;

    .line 14
    .line 15
    invoke-virtual {v1, v2, v0}, Lmd/e;->i(Lmd/k0;Lmd/b0;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    new-instance v0, Lmd/b0;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lod/D;->d:Lmd/e;

    .line 25
    .line 26
    iget-object v2, p0, Lod/D;->e:Lmd/k0;

    .line 27
    .line 28
    invoke-virtual {v1, v2, v0}, Lmd/e;->i(Lmd/k0;Lmd/b0;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
