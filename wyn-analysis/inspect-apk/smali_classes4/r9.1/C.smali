.class public final synthetic Lr9/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr9/F;

.field public final synthetic c:Ls9/k;


# direct methods
.method public synthetic constructor <init>(Lr9/F;Ls9/k;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr9/C;->a:I

    iput-object p1, p0, Lr9/C;->b:Lr9/F;

    iput-object p2, p0, Lr9/C;->c:Ls9/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x5

    .line 7
    iget-object v6, p0, Lr9/C;->c:Ls9/k;

    .line 8
    .line 9
    iget-object v7, p0, Lr9/C;->b:Lr9/F;

    .line 10
    .line 11
    iget v8, p0, Lr9/C;->a:I

    .line 12
    .line 13
    check-cast p1, Lq9/a;

    .line 14
    .line 15
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    packed-switch v8, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget v8, p1, Lq9/a;->a:I

    .line 22
    .line 23
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    iget-object v6, v6, Ls9/k;->a:Ls9/h;

    .line 28
    .line 29
    iget-object v6, v6, Ls9/h;->a:Ls9/m;

    .line 30
    .line 31
    invoke-virtual {v6}, Ls9/m;->c()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v9, p1, Lq9/a;->c:[B

    .line 36
    .line 37
    iget-object p1, p1, Lq9/a;->d:[B

    .line 38
    .line 39
    iget-object v10, v7, Lr9/F;->c:Ljava/lang/String;

    .line 40
    .line 41
    new-array v5, v5, [Ljava/lang/Object;

    .line 42
    .line 43
    aput-object v8, v5, v4

    .line 44
    .line 45
    aput-object v10, v5, v3

    .line 46
    .line 47
    aput-object v9, v5, v2

    .line 48
    .line 49
    aput-object p1, v5, v1

    .line 50
    .line 51
    aput-object v6, v5, v0

    .line 52
    .line 53
    iget-object p1, v7, Lr9/F;->a:Lr9/K;

    .line 54
    .line 55
    const-string v0, "DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?"

    .line 56
    .line 57
    invoke-virtual {p1, v0, v5}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_0
    iget v8, p1, Lq9/a;->a:I

    .line 62
    .line 63
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    iget-object v6, v6, Ls9/k;->a:Ls9/h;

    .line 68
    .line 69
    iget-object v6, v6, Ls9/h;->a:Ls9/m;

    .line 70
    .line 71
    invoke-virtual {v6}, Ls9/m;->c()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    iget-object v9, p1, Lq9/a;->c:[B

    .line 76
    .line 77
    iget-object p1, p1, Lq9/a;->d:[B

    .line 78
    .line 79
    iget-object v10, v7, Lr9/F;->c:Ljava/lang/String;

    .line 80
    .line 81
    new-array v5, v5, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object v8, v5, v4

    .line 84
    .line 85
    aput-object v10, v5, v3

    .line 86
    .line 87
    aput-object v9, v5, v2

    .line 88
    .line 89
    aput-object p1, v5, v1

    .line 90
    .line 91
    aput-object v6, v5, v0

    .line 92
    .line 93
    iget-object p1, v7, Lr9/F;->a:Lr9/K;

    .line 94
    .line 95
    const-string v0, "INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)"

    .line 96
    .line 97
    invoke-virtual {p1, v0, v5}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
