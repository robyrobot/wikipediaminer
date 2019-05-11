// File generated by hadoop record compiler. Do not edit.
package org.wikipedia.miner.db.struct;

public class DbLinkLocation extends org.apache.hadoop.record.Record {
  private static final org.apache.hadoop.record.meta.RecordTypeInfo _rio_recTypeInfo;
  private static org.apache.hadoop.record.meta.RecordTypeInfo _rio_rtiFilter;
  private static int[] _rio_rtiFilterFields;
  static {
    _rio_recTypeInfo = new org.apache.hadoop.record.meta.RecordTypeInfo("DbLinkLocation");
    _rio_recTypeInfo.addField("LinkId", org.apache.hadoop.record.meta.TypeID.IntTypeID);
    _rio_recTypeInfo.addField("SentenceIndexes", new org.apache.hadoop.record.meta.VectorTypeID(org.apache.hadoop.record.meta.TypeID.IntTypeID));
  }
  
  private int LinkId;
  private java.util.ArrayList<Integer> SentenceIndexes;
  public DbLinkLocation() { }
  public DbLinkLocation(
    final int LinkId,
    final java.util.ArrayList<Integer> SentenceIndexes) {
    this.LinkId = LinkId;
    this.SentenceIndexes = SentenceIndexes;
  }
  public static org.apache.hadoop.record.meta.RecordTypeInfo getTypeInfo() {
    return _rio_recTypeInfo;
  }
  public static void setTypeFilter(org.apache.hadoop.record.meta.RecordTypeInfo rti) {
    if (null == rti) return;
    _rio_rtiFilter = rti;
    _rio_rtiFilterFields = null;
  }
  private static void setupRtiFields()
  {
    if (null == _rio_rtiFilter) return;
    // we may already have done this
    if (null != _rio_rtiFilterFields) return;
    int _rio_i, _rio_j;
    _rio_rtiFilterFields = new int [_rio_rtiFilter.getFieldTypeInfos().size()];
    for (_rio_i=0; _rio_i<_rio_rtiFilterFields.length; _rio_i++) {
      _rio_rtiFilterFields[_rio_i] = 0;
    }
    java.util.Iterator<org.apache.hadoop.record.meta.FieldTypeInfo> _rio_itFilter = _rio_rtiFilter.getFieldTypeInfos().iterator();
    _rio_i=0;
    while (_rio_itFilter.hasNext()) {
      org.apache.hadoop.record.meta.FieldTypeInfo _rio_tInfoFilter = _rio_itFilter.next();
      java.util.Iterator<org.apache.hadoop.record.meta.FieldTypeInfo> _rio_it = _rio_recTypeInfo.getFieldTypeInfos().iterator();
      _rio_j=1;
      while (_rio_it.hasNext()) {
        org.apache.hadoop.record.meta.FieldTypeInfo _rio_tInfo = _rio_it.next();
        if (_rio_tInfo.equals(_rio_tInfoFilter)) {
          _rio_rtiFilterFields[_rio_i] = _rio_j;
          break;
        }
        _rio_j++;
      }
      _rio_i++;
    }
  }
  public int getLinkId() {
    return LinkId;
  }
  public void setLinkId(final int LinkId) {
    this.LinkId=LinkId;
  }
  public java.util.ArrayList<Integer> getSentenceIndexes() {
    return SentenceIndexes;
  }
  public void setSentenceIndexes(final java.util.ArrayList<Integer> SentenceIndexes) {
    this.SentenceIndexes=SentenceIndexes;
  }
  public void serialize(final org.apache.hadoop.record.RecordOutput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    _rio_a.startRecord(this,_rio_tag);
    _rio_a.writeInt(LinkId,"LinkId");
    {
      _rio_a.startVector(SentenceIndexes,"SentenceIndexes");
      int _rio_len1 = SentenceIndexes.size();
      for(int _rio_vidx1 = 0; _rio_vidx1<_rio_len1; _rio_vidx1++) {
        int _rio_e1 = SentenceIndexes.get(_rio_vidx1);
        _rio_a.writeInt(_rio_e1,"_rio_e1");
      }
      _rio_a.endVector(SentenceIndexes,"SentenceIndexes");
    }
    _rio_a.endRecord(this,_rio_tag);
  }
  private void deserializeWithoutFilter(final org.apache.hadoop.record.RecordInput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    _rio_a.startRecord(_rio_tag);
    LinkId=_rio_a.readInt("LinkId");
    {
      org.apache.hadoop.record.Index _rio_vidx1 = _rio_a.startVector("SentenceIndexes");
      SentenceIndexes=new java.util.ArrayList<Integer>();
      for (; !_rio_vidx1.done(); _rio_vidx1.incr()) {
        int _rio_e1;
        _rio_e1=_rio_a.readInt("_rio_e1");
        SentenceIndexes.add(_rio_e1);
      }
      _rio_a.endVector("SentenceIndexes");
    }
    _rio_a.endRecord(_rio_tag);
  }
  public void deserialize(final org.apache.hadoop.record.RecordInput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    if (null == _rio_rtiFilter) {
      deserializeWithoutFilter(_rio_a, _rio_tag);
      return;
    }
    // if we're here, we need to read based on version info
    _rio_a.startRecord(_rio_tag);
    setupRtiFields();
    for (int _rio_i=0; _rio_i<_rio_rtiFilter.getFieldTypeInfos().size(); _rio_i++) {
      if (1 == _rio_rtiFilterFields[_rio_i]) {
        LinkId=_rio_a.readInt("LinkId");
      }
      else if (2 == _rio_rtiFilterFields[_rio_i]) {
        {
          org.apache.hadoop.record.Index _rio_vidx1 = _rio_a.startVector("SentenceIndexes");
          SentenceIndexes=new java.util.ArrayList<Integer>();
          for (; !_rio_vidx1.done(); _rio_vidx1.incr()) {
            int _rio_e1;
            _rio_e1=_rio_a.readInt("_rio_e1");
            SentenceIndexes.add(_rio_e1);
          }
          _rio_a.endVector("SentenceIndexes");
        }
      }
      else {
        java.util.ArrayList<org.apache.hadoop.record.meta.FieldTypeInfo> typeInfos = (java.util.ArrayList<org.apache.hadoop.record.meta.FieldTypeInfo>)(_rio_rtiFilter.getFieldTypeInfos());
        org.apache.hadoop.record.meta.Utils.skip(_rio_a, typeInfos.get(_rio_i).getFieldID(), typeInfos.get(_rio_i).getTypeID());
      }
    }
    _rio_a.endRecord(_rio_tag);
  }
  public int compareTo (final Object _rio_peer_) throws ClassCastException {
    if (!(_rio_peer_ instanceof DbLinkLocation)) {
      throw new ClassCastException("Comparing different types of records.");
    }
    DbLinkLocation _rio_peer = (DbLinkLocation) _rio_peer_;
    int _rio_ret = 0;
    _rio_ret = (LinkId == _rio_peer.LinkId)? 0 :((LinkId<_rio_peer.LinkId)?-1:1);
    if (_rio_ret != 0) return _rio_ret;
    {
      int _rio_len11 = SentenceIndexes.size();
      int _rio_len21 = _rio_peer.SentenceIndexes.size();
      for(int _rio_vidx1 = 0; _rio_vidx1<_rio_len11 && _rio_vidx1<_rio_len21; _rio_vidx1++) {
        int _rio_e11 = SentenceIndexes.get(_rio_vidx1);
        int _rio_e21 = _rio_peer.SentenceIndexes.get(_rio_vidx1);
        _rio_ret = (_rio_e11 == _rio_e21)? 0 :((_rio_e11<_rio_e21)?-1:1);
        if (_rio_ret != 0) { return _rio_ret; }
      }
      _rio_ret = (_rio_len11 - _rio_len21);
    }
    if (_rio_ret != 0) return _rio_ret;
    return _rio_ret;
  }
  public boolean equals(final Object _rio_peer_) {
    if (!(_rio_peer_ instanceof DbLinkLocation)) {
      return false;
    }
    if (_rio_peer_ == this) {
      return true;
    }
    DbLinkLocation _rio_peer = (DbLinkLocation) _rio_peer_;
    boolean _rio_ret = false;
    _rio_ret = (LinkId==_rio_peer.LinkId);
    if (!_rio_ret) return _rio_ret;
    _rio_ret = SentenceIndexes.equals(_rio_peer.SentenceIndexes);
    if (!_rio_ret) return _rio_ret;
    return _rio_ret;
  }
  public Object clone() throws CloneNotSupportedException {
    DbLinkLocation _rio_other = new DbLinkLocation();
    _rio_other.LinkId = this.LinkId;
    _rio_other.SentenceIndexes = (java.util.ArrayList<Integer>) this.SentenceIndexes.clone();
    return _rio_other;
  }
  public int hashCode() {
    int _rio_result = 17;
    int _rio_ret;
    _rio_ret = LinkId;
    _rio_result = 37*_rio_result + _rio_ret;
    _rio_ret = SentenceIndexes.hashCode();
    _rio_result = 37*_rio_result + _rio_ret;
    return _rio_result;
  }
  public static String signature() {
    return "LDbLinkLocation(i[i])";
  }
  public static class Comparator extends org.apache.hadoop.record.RecordComparator {
    public Comparator() {
      super(DbLinkLocation.class);
    }
    static public int slurpRaw(byte[] b, int s, int l) {
      try {
        int os = s;
        {
          int i = org.apache.hadoop.record.Utils.readVInt(b, s);
          int z = org.apache.hadoop.record.Utils.getVIntSize(i);
          s+=z; l-=z;
        }
        {
          int vi1 = org.apache.hadoop.record.Utils.readVInt(b, s);
          int vz1 = org.apache.hadoop.record.Utils.getVIntSize(vi1);
          s+=vz1; l-=vz1;
          for (int vidx1 = 0; vidx1 < vi1; vidx1++){
            int i = org.apache.hadoop.record.Utils.readVInt(b, s);
            int z = org.apache.hadoop.record.Utils.getVIntSize(i);
            s+=z; l-=z;
          }
        }
        return (os - s);
      } catch(java.io.IOException e) {
        throw new RuntimeException(e);
      }
    }
    static public int compareRaw(byte[] b1, int s1, int l1,
                                   byte[] b2, int s2, int l2) {
      try {
        int os1 = s1;
        {
          int i1 = org.apache.hadoop.record.Utils.readVInt(b1, s1);
          int i2 = org.apache.hadoop.record.Utils.readVInt(b2, s2);
          if (i1 != i2) {
            return ((i1-i2) < 0) ? -1 : 0;
          }
          int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
          int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
          s1+=z1; s2+=z2; l1-=z1; l2-=z2;
        }
        {
          int vi11 = org.apache.hadoop.record.Utils.readVInt(b1, s1);
          int vi21 = org.apache.hadoop.record.Utils.readVInt(b2, s2);
          int vz11 = org.apache.hadoop.record.Utils.getVIntSize(vi11);
          int vz21 = org.apache.hadoop.record.Utils.getVIntSize(vi21);
          s1+=vz11; s2+=vz21; l1-=vz11; l2-=vz21;
          for (int vidx1 = 0; vidx1 < vi11 && vidx1 < vi21; vidx1++){
            int i1 = org.apache.hadoop.record.Utils.readVInt(b1, s1);
            int i2 = org.apache.hadoop.record.Utils.readVInt(b2, s2);
            if (i1 != i2) {
              return ((i1-i2) < 0) ? -1 : 0;
            }
            int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
            int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
            s1+=z1; s2+=z2; l1-=z1; l2-=z2;
          }
          if (vi11 != vi21) { return (vi11<vi21)?-1:0; }
        }
        return (os1 - s1);
      } catch(java.io.IOException e) {
        throw new RuntimeException(e);
      }
    }
    public int compare(byte[] b1, int s1, int l1,
                         byte[] b2, int s2, int l2) {
      int ret = compareRaw(b1,s1,l1,b2,s2,l2);
      return (ret == -1)? -1 : ((ret==0)? 1 : 0);}
  }
  
  static {
    org.apache.hadoop.record.RecordComparator.define(DbLinkLocation.class, new Comparator());
  }
}
