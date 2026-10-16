.class public final synthetic Lo2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IJJI)V
    .locals 0

    .line 1
    iput p7, p0, Lo2/b;->a:I

    iput-object p1, p0, Lo2/b;->e:Ljava/lang/Object;

    iput p2, p0, Lo2/b;->b:I

    iput-wide p3, p0, Lo2/b;->c:J

    iput-wide p5, p0, Lo2/b;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lo2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/b;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt6/d;

    .line 9
    .line 10
    iget-object v0, v0, Lt6/d;->b:LF5/f;

    .line 11
    .line 12
    iget-object v1, v0, LF5/f;->d:LC6/l;

    .line 13
    .line 14
    iget-object v2, v1, LC6/l;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ll8/K;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, v1, LC6/l;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ll8/K;

    .line 29
    .line 30
    invoke-static {v1}, Ll8/s;->j(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lf6/z;

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, v1}, LF5/f;->L(Lf6/z;)LF5/a;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-instance v2, LF5/e;

    .line 41
    .line 42
    iget-wide v5, p0, Lo2/b;->c:J

    .line 43
    .line 44
    iget-wide v7, p0, Lo2/b;->d:J

    .line 45
    .line 46
    iget v4, p0, Lo2/b;->b:I

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    invoke-direct/range {v2 .. v9}, LF5/e;-><init>(Ljava/lang/Object;IJJI)V

    .line 50
    .line 51
    .line 52
    const/16 v1, 0x3ee

    .line 53
    .line 54
    invoke-virtual {v0, v3, v1, v2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_0
    iget-object v0, p0, Lo2/b;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lo2/c;

    .line 61
    .line 62
    iget-object v0, v0, Lo2/c;->b:LV1/d;

    .line 63
    .line 64
    iget-object v1, v0, LV1/d;->d:LC6/l;

    .line 65
    .line 66
    iget-object v2, v1, LC6/l;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Ll8/K;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget-object v1, v1, LC6/l;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Ll8/K;

    .line 81
    .line 82
    invoke-static {v1}, Ll8/s;->j(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lk2/H;

    .line 87
    .line 88
    :goto_1
    invoke-virtual {v0, v1}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    new-instance v2, LF5/e;

    .line 93
    .line 94
    iget-wide v5, p0, Lo2/b;->c:J

    .line 95
    .line 96
    iget-wide v7, p0, Lo2/b;->d:J

    .line 97
    .line 98
    iget v4, p0, Lo2/b;->b:I

    .line 99
    .line 100
    const/4 v9, 0x2

    .line 101
    invoke-direct/range {v2 .. v9}, LF5/e;-><init>(Ljava/lang/Object;IJJI)V

    .line 102
    .line 103
    .line 104
    const/16 v1, 0x3ee

    .line 105
    .line 106
    invoke-virtual {v0, v3, v1, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
