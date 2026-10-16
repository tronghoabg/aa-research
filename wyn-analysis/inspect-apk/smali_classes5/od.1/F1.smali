.class public final Lod/F1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lod/a2;


# direct methods
.method public synthetic constructor <init>(Lod/a2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lod/F1;->a:I

    iput-object p1, p0, Lod/F1;->b:Lod/a2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lod/F1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lod/F1;->b:Lod/a2;

    .line 7
    .line 8
    iget-object v0, v0, Lod/a2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lod/B0;

    .line 11
    .line 12
    iget-boolean v1, v0, Lod/B0;->z:Z

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lod/B0;->u:Lod/t;

    .line 17
    .line 18
    invoke-interface {v0}, Lod/t;->h()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lod/F1;->b:Lod/a2;

    .line 23
    .line 24
    iget-object v0, v0, Lod/a2;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lod/B0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lod/B0;->z:Z

    .line 30
    .line 31
    iget-object v1, v0, Lod/B0;->u:Lod/t;

    .line 32
    .line 33
    iget-object v0, v0, Lod/B0;->s:Lne/a;

    .line 34
    .line 35
    iget-object v2, v0, Lne/a;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lmd/k0;

    .line 38
    .line 39
    iget-object v3, v0, Lne/a;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lod/s;

    .line 42
    .line 43
    iget-object v0, v0, Lne/a;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lmd/b0;

    .line 46
    .line 47
    invoke-interface {v1, v2, v3, v0}, Lod/t;->m(Lmd/k0;Lod/s;Lmd/b0;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
