// automatically generated by the FlatBuffers compiler, do not modify

package CSProto;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ControlAVTransR extends Table {
  public static ControlAVTransR getRootAsControlAVTransR(ByteBuffer _bb) { return getRootAsControlAVTransR(_bb, new ControlAVTransR()); }
  public static ControlAVTransR getRootAsControlAVTransR(ByteBuffer _bb, ControlAVTransR obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public ControlAVTransR __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int code() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String msg() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer msgAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer msgInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public boolean audio() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : true; }
  public boolean video() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : true; }
  public boolean subtitle() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createControlAVTransR(FlatBufferBuilder builder,
      int code,
      int msgOffset,
      boolean audio,
      boolean video,
      boolean subtitle) {
    builder.startObject(5);
    ControlAVTransR.addMsg(builder, msgOffset);
    ControlAVTransR.addCode(builder, code);
    ControlAVTransR.addSubtitle(builder, subtitle);
    ControlAVTransR.addVideo(builder, video);
    ControlAVTransR.addAudio(builder, audio);
    return ControlAVTransR.endControlAVTransR(builder);
  }

  public static void startControlAVTransR(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addCode(FlatBufferBuilder builder, int code) { builder.addInt(0, code, 0); }
  public static void addMsg(FlatBufferBuilder builder, int msgOffset) { builder.addOffset(1, msgOffset, 0); }
  public static void addAudio(FlatBufferBuilder builder, boolean audio) { builder.addBoolean(2, audio, true); }
  public static void addVideo(FlatBufferBuilder builder, boolean video) { builder.addBoolean(3, video, true); }
  public static void addSubtitle(FlatBufferBuilder builder, boolean subtitle) { builder.addBoolean(4, subtitle, false); }
  public static int endControlAVTransR(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

