.class public final LA7/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:LA7/s0;


# direct methods
.method public synthetic constructor <init>(LA7/s0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, LA7/x0;->a:I

    iput-object p2, p0, LA7/x0;->b:Ljava/lang/String;

    iput-object p3, p0, LA7/x0;->c:Ljava/lang/String;

    iput-object p4, p0, LA7/x0;->d:Ljava/lang/String;

    iput-object p1, p0, LA7/x0;->e:LA7/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LA7/x0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/x0;->e:LA7/s0;

    .line 7
    .line 8
    iget-object v1, v0, LA7/s0;->a:LA7/L1;

    .line 9
    .line 10
    invoke-virtual {v1}, LA7/L1;->Z()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, LA7/s0;->a:LA7/L1;

    .line 14
    .line 15
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 16
    .line 17
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LA7/x0;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, LA7/x0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p0, LA7/x0;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v2, v3, v1}, LA7/i;->w0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_0
    iget-object v0, p0, LA7/x0;->e:LA7/s0;

    .line 32
    .line 33
    iget-object v1, v0, LA7/s0;->a:LA7/L1;

    .line 34
    .line 35
    invoke-virtual {v1}, LA7/L1;->Z()V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, LA7/s0;->a:LA7/L1;

    .line 39
    .line 40
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 41
    .line 42
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, LA7/x0;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v2, p0, LA7/x0;->b:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p0, LA7/x0;->c:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3, v1}, LA7/i;->w0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :pswitch_1
    iget-object v0, p0, LA7/x0;->e:LA7/s0;

    .line 57
    .line 58
    iget-object v1, v0, LA7/s0;->a:LA7/L1;

    .line 59
    .line 60
    invoke-virtual {v1}, LA7/L1;->Z()V

    .line 61
    .line 62
    .line 63
    iget-object v0, v0, LA7/s0;->a:LA7/L1;

    .line 64
    .line 65
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 66
    .line 67
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, LA7/x0;->d:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v2, p0, LA7/x0;->b:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v3, p0, LA7/x0;->c:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v2, v3, v1}, LA7/i;->U0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :pswitch_2
    iget-object v0, p0, LA7/x0;->e:LA7/s0;

    .line 82
    .line 83
    iget-object v1, v0, LA7/s0;->a:LA7/L1;

    .line 84
    .line 85
    invoke-virtual {v1}, LA7/L1;->Z()V

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, LA7/s0;->a:LA7/L1;

    .line 89
    .line 90
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 91
    .line 92
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, LA7/x0;->d:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v2, p0, LA7/x0;->b:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v3, p0, LA7/x0;->c:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v2, v3, v1}, LA7/i;->U0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
