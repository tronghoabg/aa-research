.class public final synthetic LU1/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LU1/M;

.field public final synthetic c:Landroid/util/Pair;

.field public final synthetic d:Lh2/g;


# direct methods
.method public synthetic constructor <init>(LU1/M;Landroid/util/Pair;Lh2/g;I)V
    .locals 0

    .line 1
    iput p4, p0, LU1/J;->a:I

    iput-object p1, p0, LU1/J;->b:LU1/M;

    iput-object p2, p0, LU1/J;->c:Landroid/util/Pair;

    iput-object p3, p0, LU1/J;->d:Lh2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LU1/J;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU1/J;->b:LU1/M;

    .line 7
    .line 8
    iget-object v0, v0, LU1/M;->b:LE5/n0;

    .line 9
    .line 10
    iget-object v0, v0, LE5/n0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LV1/d;

    .line 13
    .line 14
    iget-object v1, p0, LU1/J;->c:Landroid/util/Pair;

    .line 15
    .line 16
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lk2/H;

    .line 27
    .line 28
    iget-object v3, p0, LU1/J;->d:Lh2/g;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1, v3}, LV1/d;->q(ILk2/H;Lh2/g;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object v0, p0, LU1/J;->b:LU1/M;

    .line 35
    .line 36
    iget-object v0, v0, LU1/M;->b:LE5/n0;

    .line 37
    .line 38
    iget-object v0, v0, LE5/n0;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LV1/d;

    .line 41
    .line 42
    iget-object v1, p0, LU1/J;->c:Landroid/util/Pair;

    .line 43
    .line 44
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lk2/H;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, LU1/J;->d:Lh2/g;

    .line 60
    .line 61
    invoke-virtual {v0, v2, v1, v3}, LV1/d;->B(ILk2/H;Lh2/g;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
